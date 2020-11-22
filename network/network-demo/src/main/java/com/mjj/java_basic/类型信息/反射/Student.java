package com.mjj.java_basic.类型信息.反射;

public class Student extends Person {
    private String like;
    public Integer score;

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
