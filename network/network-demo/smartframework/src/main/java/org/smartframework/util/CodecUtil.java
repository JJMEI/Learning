package org.smartframework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by meijunjie on 2018/8/13.
 */
public final class CodecUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodecUtil.class);

    public static String encodeURL(String resources){
        String target;
        try{
            target = URLEncoder.encode(resources, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("Encode url error! exception_info={}",e);
            throw new RuntimeException(e);
        }
        return target;
    }


    public static String decodeUrl(String resources)
    {
        String target;
        try{
            target = URLDecoder.decode(resources, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("Decode url error! exception_info={}",e);
            throw new RuntimeException(e);
        }
        return target;
    }
}
