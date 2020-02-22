package com.mjj.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class ReadFile {

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {



        new FileInputStream(new File("/Users/meijunjie/Desktop/Learning/network/network-demo/src/main/resources/file/readFile.txt"));
    }
}
