package com.mjj.web.model;

/**
 * @author meijunjie
 */
public class Customer {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer score;

    public Customer() {
    }

    public Customer(Long id, String name, Integer age, String email, Integer score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.score = score;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", score=" + score +
                '}';
    }
}
