package com.mjj.smartframework.entity;

import java.util.Map;

/**
 *
 * @author meijunjie
 * @date 2018/8/13
 * <p>
 *     视图
 * </p>
 */
public class View {
    private String path;
    private Map<String, Object> model;

    public View(String path, Map<String, Object> model) {
        this.path = path;
        this.model = model;
    }

    public View addModel(String key, Object value){
        model.put(key,value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
