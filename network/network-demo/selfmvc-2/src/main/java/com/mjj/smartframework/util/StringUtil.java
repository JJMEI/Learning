package com.mjj.smartframework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by meijunjie on 2018/8/7.
 */
public final class StringUtil {
    public static boolean isEmpty(String str){
        if(str != null){
            // 过滤空字符
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
