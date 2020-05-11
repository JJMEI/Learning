package org.smartframework.handler;

import java.lang.reflect.Method;

/**
 * Created by meijunjie on 2018/8/13.
 */
public class Handler {
    /** Controller类*/
    private Class<?> controllerClass;

    /** Action方法*/
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
