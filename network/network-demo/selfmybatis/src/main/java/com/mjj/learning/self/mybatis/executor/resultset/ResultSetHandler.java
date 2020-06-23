package com.mjj.learning.self.mybatis.executor.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author meijunjie
 */
public interface ResultSetHandler {
    <E> List<E> handleResultSet(ResultSet resultSet) throws SQLException;
}
