package org.smartframework.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 *
 * @author meijunjie
 * @date 2018/8/13
 */
public final class JsonUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();


    public static <T> String toJson(T obj){
        String json;
        try{
            json = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            LOGGER.error("Convert pojo to json error! exception_info={}",e);
            throw new RuntimeException(e);
        }
        return json;
    }

    public static <T> T fromJso(String json, Class<T> type){
        T pojo;
        try{
            pojo = OBJECT_MAPPER.readValue(json, type);
        } catch (JsonParseException e) {
            LOGGER.error("Convert json to pojo error! exception_info={}",e);
            throw new RuntimeException(e);
        } catch (JsonMappingException e) {
            LOGGER.error("Convert json to pojo error! exception_info={}",e);
            throw new RuntimeException(e);
        } catch (IOException e) {
            LOGGER.error("Convert json to pojo error! exception_info={}",e);
            throw new RuntimeException(e);
        }
        return pojo;
    }

}
