package com.duanju.define;

import java.util.Scanner;

public class ArrayLeranDemo {
    public static void main(String[] args) {
        //评委打分案例,6个评委打分后算出平均分
        int[] scores=new int[6];
        Scanner num=new Scanner(System.in);
        int totalScore=0;

        for (int i = 0; i <scores.length; i++) {
            System.out.println("请输入地"+(i+1)+"位评委的分数");
            scores[i]=num.nextInt();
        }

        for (int j=0;j< scores.length;j++) {
            totalScore+=scores[j];
        }
        System.out.println("总分为："+totalScore);
        System.out.println("平均分为："+(double)totalScore/scores.length);

    }
}
