package org.smartframework;

import org.smartframework.helper.BeanHelper;
import org.smartframework.helper.ClassHelper;
import org.smartframework.helper.ControllerHelper;
import org.smartframework.helper.IocHelper;
import org.smartframework.util.ClassUtil;

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
