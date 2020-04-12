package com.serializable.protostbuff;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

@SuppressWarnings("unchecked")
public class ProtoBuffUtil {

    public static <T> byte[] serializer(T o){
        Schema schema = RuntimeSchema.getSchema(o.getClass());
        return ProtobufIOUtil.toByteArray(o,schema, LinkedBuffer.allocate(256));
    }

    public static <T> T deserializer(byte[] bytes, Class<T> clazz){
        T obj = null;
        try{
            obj = clazz.newInstance();
            Schema schema = RuntimeSchema.getSchema(obj.getClass());
            ProtostuffIOUtil.mergeFrom(bytes,obj,schema);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
