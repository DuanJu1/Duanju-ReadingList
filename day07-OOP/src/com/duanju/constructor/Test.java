package com.duanju.constructor;

public class Test {
    public static void main(String[] args) {
        //认识构造器，并掌握构造器的方法，特点

        Student s1=new Student("我牛",1000);
        System.out.println(s1.name+"  "+s1.score);
    }
}
