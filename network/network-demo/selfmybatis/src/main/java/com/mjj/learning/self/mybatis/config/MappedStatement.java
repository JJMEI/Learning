package com.mjj.learning.self.mybatis.config;

/**
 * @author meijunjie
 */
public class MappedStatement {

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 资源id
     */
    private String sourceId;

    /**
     * sql 从注解里提取 或者 从mapper.xml文件中提取
     */
    private String sql;

    /**
     * 结果类型
     */
    private String resultType;


    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
