package com.mjj.learning.self.mybatis.executor.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author meijunjie
 */
public interface ParameterHandler {

    /**
     * 给PreparedStatement 设置参数
     * @param ps
     * @throws SQLException
     */
    void setParameters(PreparedStatement ps) throws SQLException;
}
