package org.smartframework.entity;

import java.util.Map;

/**
 *
 * @author meijunjie
 * @date 2018/8/13
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name){
        return Long.valueOf((String)paramMap.get(name));
    }

    public Map<String, Object> getMap(){
        return paramMap;
    }
}
