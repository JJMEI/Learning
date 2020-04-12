package com.serializable.json.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GsonDemo {

    @Test
    public void testGson(){
        Person person = new Person();
        person.setName("Mick");
        person.setAge(12);
        Gson gson = new Gson();

        String userGson = gson.toJson(person);

        System.out.println(gson.fromJson(userGson,Person.class));

        System.out.println(gson.toJson(person));
    }


    @Test
    public void testArray(){
        Gson gson = new Gson();

        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"abc","def","ghi"};

        System.out.println(gson.toJson(integers));
        System.out.println(gson.toJson(strings));

        Integer[] integers1 = gson.fromJson("[1,2,3,4,5]",Integer[].class);
        String[] strings1 = gson.fromJson("[\"abc\",\"def\",\"ghi\"]",String[].class);

        System.out.println(Arrays.toString(integers1));
        System.out.println(Arrays.toString(strings1));
    }


    @Test
    public void testCollections(){
        Gson gson = new Gson();
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        String json = gson.toJson(integers);
        System.out.println(json);

        // 获取反射类型
        Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();

        Collection<Integer> integers1 = gson.fromJson(json,collectionType);

        System.out.println(Arrays.toString(integers1.toArray()));
    }
}
