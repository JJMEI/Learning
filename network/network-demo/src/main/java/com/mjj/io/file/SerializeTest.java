package com.mjj.io.file;

import java.io.*;

public class SerializeTest implements Serializable {

    private static final long serialVersionID = -1027301290310928L;

    public int num = 1390;

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/meijunjie/Desktop/Learning/serialize.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);


        SerializeTest serializeTest = new SerializeTest();

        oos.writeObject(serializeTest);

        oos.flush();

    }
}
