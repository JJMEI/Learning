package com.example;

import javassist.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.Arrays;


/**
 * @author meijunjie
 */

public class ClassFileTransformerTest implements ClassFileTransformer {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassFileTransformerTest.class);
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {


        // 过滤指定包名下的类
        if(!className.startsWith("com/example")){
            return null;
        }else {
            LOGGER.info("className = {}",className);

            String fullClassName = className.replaceAll("/",".");
            LOGGER.info("fullClassName = {}",fullClassName);

            ClassPool classPool = ClassPool.getDefault();
            LOGGER.info("classPool = {}",classPool);

            CtClass ctClass = null;
            try{
                ctClass = classPool.get(fullClassName);
            } catch (NotFoundException e) {
                try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(classfileBuffer)){
                    ctClass = classPool.makeClass(byteArrayInputStream);
                }catch (IOException ex){
                    LOGGER.error("exception = {}, error = {}","exception",ex);
                }
            }

            if(ctClass == null || ctClass.isInterface()){
                return null;
            }

            try{
                Object[] annotations = ctClass.getAnnotations();
                LOGGER.info("className = {}, annotations = {}",className, Arrays.toString(annotations));
                CtMethod[] methods = ctClass.getDeclaredMethods();
                for(CtMethod ctMethod : methods){
                    LOGGER.info("className = {}, methodName={}",className,ctMethod.getName());
                    ctMethod.insertBefore("long start = "+System.currentTimeMillis() + ";");
                    ctMethod.insertAfter("System.out.println(\"(" + System.currentTimeMillis() + "-start) transform end...\");");

                }
                return ctClass.toBytecode();
            } catch (ClassNotFoundException | CannotCompileException | IOException ex) {
                LOGGER.error("exception = {}",ex);
                return null;
            } finally {
                // 清除缓存
                ctClass.detach();
            }

        }
    }
}
