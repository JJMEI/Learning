package com.mjj.orm.mybatis.jdbc.xa分布式事务;

import javax.transaction.xa.Xid;

public class MyXid implements Xid {


    private int formatId;
    private byte gtrif[];
    private byte bqual[];

    public MyXid() {
    }


    public MyXid(int formatId, byte[] gtrif, byte[] bqual) {
        this.formatId = formatId;
        this.gtrif = gtrif;
        this.bqual = bqual;
    }

    @Override
    public int getFormatId() {
        return formatId;
    }

    @Override
    public byte[] getGlobalTransactionId() {
        return gtrif;
    }

    @Override
    public byte[] getBranchQualifier() {
        return bqual;
    }
}
