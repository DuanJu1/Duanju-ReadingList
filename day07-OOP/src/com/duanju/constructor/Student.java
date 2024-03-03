package com.duanju.constructor;

public class Student {
    String name;
    Double score;
    public Student(){
        System.out.println("无参数构造器触发");
    }

    //重载
    public  Student(String name,double score){
        System.out.println("有参数构造器触发");
        this.name=name;
        this.score=score;
    }
}
