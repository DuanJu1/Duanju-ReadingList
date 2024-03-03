package com.duanju.parameter;

import java.util.Scanner;

public class ParameteDemo2 {
    public static void main(String[] args) {
        //输出[11,22,33,44,55]
        Scanner sc=new Scanner(System.in);
        System.out.println("输入n个数字");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("第"+(i+1)+"个数字");
            arr[i]=sc.nextInt();
        }
        Printarr(arr);


    }


    public static void Printarr(int[] arr){

        if (arr==null){
            System.out.println("null");
            return;
        }
       /* System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");5
            }

        }
        System.out.print("]");*/
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }
}
