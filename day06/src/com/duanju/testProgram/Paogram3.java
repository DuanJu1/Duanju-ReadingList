package com.duanju.testProgram;

import java.util.Scanner;

public class Paogram3 {
    public static void main(String[] args) {
        //在唱歌比赛中，可能有多名评委要给选手打分，分数是[0-100]之间的整数。
        // 选手最后得分为:去掉最高分、最低分后剩余分数的平均分，
        // 请编写程序能够录入多名评委的分数，并算出选手的最终得分
        getAverageScore(5);

    }

    public static double getAverageScore(int number){
        int[] scores=new int[number];
        //[90,97,95,99,100]
        int average=0;

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("输入第"+(i+1)+"个评委的分数");
            scores[i]=sc.nextInt();
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.print("评委原来");
            System.out.println(scores[i]);
        }


        for (int i = 1; i < scores.length; i++) {
            int temp=scores[0];
            if (scores[i]<temp){
                scores[i-1]=scores[i];
                scores[i]=temp;
                temp=scores[i-1];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print("评委排序");
            System.out.println(scores[i]);
        }

        return 0;

    }
}
