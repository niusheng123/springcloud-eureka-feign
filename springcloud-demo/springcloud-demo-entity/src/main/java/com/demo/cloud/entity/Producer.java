package com.demo.cloud.entity;

/**
 * @author NS
 * @date 2020/6/4 16:59
 */
public class Producer {

    private String name;

    private int age;

    private String add;

    private String email;

    public Producer(String name, int age, String add, String email) {
        this.name = name;
        this.age = age;
        this.add = add;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
