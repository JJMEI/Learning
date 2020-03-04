package com.mjj.spring.myresouce;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public interface Resource extends InputStreamSource {

    boolean exists();

    default boolean isReadable() {
        return exists();
    }

    default boolean isOpen(){
        return false;
    }

    default boolean isFile(){
        return false;
    }


    URL getURL() throws IOException;
    URI getURI() throws IOException;
    File getFile() throws IOException;



}
