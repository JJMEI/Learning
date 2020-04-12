package com.serializable.protostbuff;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Mick");
        user.setAge(12);
        user.setAddress("China");
        user.setEmail("mmeijunjie@gmail.com");
        user.setPhoneNum("13011028787");


        byte[] serializerUser = ProtoBuffUtil.serializer(user);

        System.out.println("serializer result: " + Arrays.toString(serializerUser));

        User deSerializerUser = ProtoBuffUtil.deserializer(serializerUser,User.class);
        System.out.println(deSerializerUser);
    }
}
