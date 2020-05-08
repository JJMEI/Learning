package com.mjj.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalTime;

public class SL4JLogBackDemo {

    /**
     * sl4j在编译期就知道了Logger的实现，实现了静态绑定
     *
     *
     *
     * 具体代码分析

     public static Logger getLogger(Class<?> clazz) {
        // 调用getLogger()
        Logger logger = getLogger(clazz.getName());
        if (DETECT_LOGGER_NAME_MISMATCH)
     {
            Class<?> autoComputedCallingClass = Util.getCallingClass();
        if (autoComputedCallingClass != null && nonMatchingClasses(clazz, autoComputedCallingClass)) {
            Util.report(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), autoComputedCallingClass.getName()));
            Util.report("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
     }
        return logger;
     }
     *
     *
     *
     * // logback如何加载配置文件
     *  final public static String GROOVY_AUTOCONFIG_FILE = "logback.groovy";
        final public static String AUTOCONFIG_FILE = "logback.xml";
        final public static String TEST_AUTOCONFIG_FILE = "logback-test.xml";
        final public static String CONFIG_FILE_PROPERTY = "logback.configurationFile";
     *  logback 按以下顺序加载配置文件
     *
     *  logback.configurationFile --> logback.groovy --> logback-test.xml --> logback.xml 如果都没加载到则使用默认的
     *  配置文件输出到控制台
     *
     */
    private static Logger logger = LoggerFactory.getLogger(SL4JLogBackDemo.class);


    public static void main(String[] args) {
        for (;;){
            logger.info("now is {}", LocalTime.now().toString());
        }
    }
}
