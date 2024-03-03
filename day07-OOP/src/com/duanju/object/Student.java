package com.duanju.object;

public class Student {
    String name;
    double Chinese;
    double Math;

    public void printTotalScore(){
        System.out.println(name+"的总成绩为:"+(Chinese+Math));
    }

    public void printAverageScore(){
        System.out.println(name+"的平均成绩为:"+(Chinese+Math)/2.0);
    }




}
