package com.mjj.learning.self.mybatis.executor.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DefaultParameterHandler implements ParameterHandler {

    private Object parameter;


    public DefaultParameterHandler(Object parameter) {
        super();
        this.parameter = parameter;
    }

    public Object getParameter() {
        return parameter;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }




    @Override
    public void setParameters(PreparedStatement ps) throws SQLException {
        if(parameter == null){
            return;
        }

        if(parameter.getClass().isArray()){
            Object[] paramArray = (Object[]) parameter;
            for(int i=0;i<paramArray.length;i++){
                if(paramArray[i] instanceof Integer){
                    ps.setInt(i+1, (Integer) paramArray[i]);
                }else if(paramArray[i] instanceof String){
                    ps.setString(i+1, (String) paramArray[i]);
                }else if(paramArray[i] instanceof Long){
                    ps.setLong(i+1, (Long) paramArray[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Object[] test = new Object[]{"dsds",1};

        for(int i=0;i<test.length;i++){
            if(test[i] instanceof Integer){
                System.out.println(test[i]);
            }else if(test[i] instanceof String){
                System.out.println(test[i]);
            }
        }
    }
}
