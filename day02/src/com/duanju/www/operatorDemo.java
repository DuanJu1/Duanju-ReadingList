package com.duanju.www;

public class operatorDemo {
    public static void main(String[] args) {
        int i=5;
        int j=2;
        System.out.println((5 / 2));
        System.out.println(1.0*5 / 2);
        //将第一个数字的类型提升为小数

        int m=10;
        int rs=++m;
        System.out.println(m);
        System.out.println(rs);

        int v=10;
        int rs1=v++;
        System.out.println(v);
        System.out.println(rs1);
        
        //三元运算符
        double score=  98.5;
        String resout=score>=60?"成绩及格":"成绩不及格";
        System.out.println(resout);

        int a1=898;
        int a2=34;
        int max=a1>a2?a1:a2;
        System.out.println(max);

        int b1=10;
        int b2=45;
        int b3=34;
        int Max=(b1>b2?b1:b2)>b3?(b1>b2?b1:b2):b3;
        System.out.println(Max);


    }
}
