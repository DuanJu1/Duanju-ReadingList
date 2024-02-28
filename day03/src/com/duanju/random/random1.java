package com.duanju.random;

import java.util.Random;

public class random1 {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i=1;i<=30;i++) {
            //9-18
            int number = random.nextInt(10)+9;
            System.out.println("随机生成了"+number);
        }
        //减加法
    }
}
