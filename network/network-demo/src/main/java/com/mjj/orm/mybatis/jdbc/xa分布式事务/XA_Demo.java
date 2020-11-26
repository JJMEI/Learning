package com.mjj.orm.mybatis.jdbc.xa分布式事务;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;

import javax.sql.XAConnection;
import javax.transaction.xa.XAException;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class XA_Demo {

    public static MysqlXADataSource getDataSource(String connecStr, String user, String password){

            MysqlXADataSource ds = new MysqlXADataSource();
            ds.setUrl(connecStr);
            ds.setUser(user);
            ds.setPassword(password);
            return ds;

    }


    public static void main(String[] args) throws XAException {
        String url1 = "jdbc:mysql://127.0.0.1:3306/bank_shanghai";
        String url2 = "jdbc:mysql://127.0.0.1:3306/bank_beijing";

        try{
            MysqlXADataSource ds1 = getDataSource(url1,"root","rootroot");
            MysqlXADataSource ds2 = getDataSource(url2,"root","rootroot");

            XAConnection xaConnection1 = ds1.getXAConnection();
            XAResource xaResource1 = xaConnection1.getXAResource();
            Connection connection1 = xaConnection1.getConnection();
            Statement statement1 = connection1.createStatement();


            XAConnection xaConnection2 = ds2.getXAConnection();
            XAResource xaResource2 = xaConnection2.getXAResource();
            Connection connection2 = xaConnection2.getConnection();
            Statement statement2 = connection2.createStatement();



            Xid xid1 = new MyXid(100,new byte[]{0x01},new byte[]{0x02});

            Xid xid2 = new MyXid(100,new byte[]{0x11},new byte[]{0x12});

            xaResource1.start(xid1,XAResource.TMNOFLAGS);
            statement1.execute("UPDATE account SET money=money-1000 WHERE user='Jack'");

            xaResource1.end(xid1,XAResource.TMNOFLAGS);



            xaResource2.start(xid2,XAResource.TMNOFLAGS);
            statement2.execute("UPDATE account SET money=money+1000 WHERE user='Peter'");

            xaResource2.end(xid2,XAResource.TMNOFLAGS);

            int res2 = xaResource2.prepare(xid2);
            int res1 = xaResource1.prepare(xid1);


            if(res1 == XAResource.XA_OK && res2 == XAResource.XA_OK){
                xaResource1.commit(xid1,false);
                xaResource2.commit(xid2,false);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
