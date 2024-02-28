package com.duanju.www;

public class TypeConversionDemo {
    public static void main(String[] args) {
        //理解自动类型转换
        byte a=23;
        int b=a;//完成了小范围自动类型转换
        System.out.println(a);
        System.out.println(b);

        int c=45;
        byte d= (byte) c;
        System.out.println(c);
        System.out.println(d);

        double i=99.879790;
        int j= (int) i;
        System.out.println(j);


        //面试题目
        byte a11=10;
        byte a12=20;
        int f=a11+a12;
        System.out.println(f);

    }
}
