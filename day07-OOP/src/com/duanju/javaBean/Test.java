package com.duanju.javaBean;

public class Test {
    public static void main(String[] args) {
        //学习JavaBean
        Student s1=new Student();
        s1.setName("hh");
        s1.setScore(100.0);


        /*Student s2=new Student("歪哈哈",999.0);
        System.out.println(s2.getName()+s2.getScore());*/
        StudentOperate operate=new StudentOperate(s1);
        operate.printPass();



    }
}
