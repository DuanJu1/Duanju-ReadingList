package com.duanju.escapsolution;

public class Test {
    public static void main(String[] args) {
        //合理暴露，合理隐藏
        Student s1=new Student();
        s1.setScore(-99);
        System.out.println(s1.getScore());
        s1.printPass();

    }


}
