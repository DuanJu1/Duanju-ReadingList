package com.duanju.demo;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //完成5个员工的随机排序
        //录入数据{11，22，33，44，55}

        Scanner sc=new Scanner(System.in);
        Integer[] codes=new Integer[5];
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第"+(i+1)+"位员工的工号");

            codes[i]=sc.nextInt();
        }

        Random random=new Random();
        for (int i = 0; i < codes.length; i++) {
            int index= random.nextInt(codes.length);

            int temp=codes[index];
            codes[index]=codes[i];
            codes[i]=temp;
        }

        //输出之前
        System.out.println("改变之后");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+" ");
        }
    }

}
