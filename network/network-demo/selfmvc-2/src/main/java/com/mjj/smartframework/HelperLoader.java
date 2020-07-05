package com.mjj.smartframework;


import com.mjj.smartframework.helper.BeanHelper;
import com.mjj.smartframework.helper.ClassHelper;
import com.mjj.smartframework.helper.ControllerHelper;
import com.mjj.smartframework.helper.IocHelper;
import com.mjj.smartframework.util.ClassUtil;

/**
 *
 * @author meijunjie
 * @date 2018/8/13
 */
public class HelperLoader {
    public static void init(){
        Class<?>[] classList = {ClassHelper.class, BeanHelper.class, IocHelper.class, ControllerHelper.class};
        for(Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
