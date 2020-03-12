package com.mjj.spring.cap1;

public class SubPerson {

    private String subName;

    public SubPerson(String subName) {
        this.subName = subName;
    }

    public SubPerson() {
    }


    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "SubPerson{" +
                "subName='" + subName + '\'' +
                '}';
    }
}
