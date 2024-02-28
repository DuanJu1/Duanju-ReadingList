package com.duanju.flowControl;

import java.util.Scanner;

public class flowControlDemo1 {
    public static void main(String[] args) {
       /* double money =99;
        if(money>90){
            System.out.println(("发送红包成功"));
        }else
            System.out.println("发生失败");*/
        System.out.println("输入一个分数");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0&&number<60){
            System.out.println("成绩为D");
        } else if (number>=60&&number<70) {
            System.out.println("成绩为C");
        }else if (number>=70&&number<80) {
            System.out.println("成绩为B");
        }else if (number>=80&&number<90) {
            System.out.println("成绩为A");
        }else if (number>=90&&number<=100) {
            System.out.println("成绩为S");
        }else System.out.println("输入错误");

    }
}
