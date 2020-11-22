//package com.mjj.tomcat.chapter3;
//
//import org.apache.tomcat.util.res.StringManager;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ParameterMap extends HashMap {
//
//    private boolean locked = false;
//
//    public ParameterMap(){
//        super();
//    }
//
//    public ParameterMap(int initialCapacity){
//        super(initialCapacity);
//    }
//
//    public ParameterMap(int initialCapacity,float loadFactor){
//        super(initialCapacity, loadFactor);
//    }
//
//    public ParameterMap(Map map){
//        super(map);
//    }
//
//    public boolean isLocked(){
//        return this.locked;
//    }
//
//    private static final StringManager sm = new StringManager().getString("org.apache.catalina.util");
//
//    @Override
//    public void clear(){
//        if(locked){
//            throw new IllegalStateException(sm.getString("parameterMap.locked"));
//        }
//        super.clear();
//    }
//}
