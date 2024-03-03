package com.duanju.testProgram;

public class Program9 {
    public static void main(String[] args) {
        //打印三角形
        int n=43;
        for (int i = 0; i <n; i++) {
            //打印行
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            //打印列
            for (int j = 0; j < (2*i-1);j++) {
                //System.out.print("*");
                //偶数列不打
                System.out.print(j%2==0?" ":"*");
            }
            System.out.println(" ");

        }
    }
}
