package com.duanju.demo;

public class Arraylist {
    public static void main(String[] args) {
        //选择数组中最大的值
        int[] faceScores={15,9000,15000,20000,6000,-5};
        int max=faceScores[0];
        for (int i = 1; i < faceScores.length ; i++) {
            if (faceScores[i]>max){
                max=faceScores[i];
            }
        }
        System.out.println("最大值为："+max);
    }
}
