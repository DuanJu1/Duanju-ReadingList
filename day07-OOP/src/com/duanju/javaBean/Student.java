package com.duanju.javaBean;

public class Student {
    //成员变量私有
   private String name;
   private Double score;

    public String getName() {
        return name;
    }

    public Student() {
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
