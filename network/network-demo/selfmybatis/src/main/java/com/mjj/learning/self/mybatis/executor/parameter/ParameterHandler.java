package com.mjj.learning.self.mybatis.executor.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface ParameterHandler {
    void setParameters(PreparedStatement ps) throws SQLException;
}
