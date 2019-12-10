package com.ghada.myapplication;

public class Student {

    String name;
    String level;
    String age;
    String degree;


    public Student(String name, String level, String age, String degree) {
        this.name = name;
        this.level = level;
        this.age = age;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
