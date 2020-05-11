package org.smartframework.helper;

import org.smartframework.constant.ConfigConstant;
import org.smartframework.util.PropsUtil;

import java.util.Properties;

/**
 *
 * @author meijunjie @date 2018/8/10
 * <p>
 *     读取配置文件
 * </p>
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPERTIES = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPERTIES,ConfigConstant.JDBC_DIVER);
    }

    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.JDBC_URL);
    }

    public static String getJdbcUsername(){
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.JDBC_USERNAME);
    }

    public static String getJdbcPassword(){
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.JDBC_PASSWORD);
    }

    public static String getAppBasePackage(){
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.APP_BASE_PACKAGE);
    }

    public static String getAppJspPath(){
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.APP_JSP_PATH,"/WEB-INF/view/");
    }

    public static String getAppAssetPath(){
        return PropsUtil.getString(CONFIG_PROPERTIES, ConfigConstant.APP_ASSET_PATH,"/asset/");
    }
}
