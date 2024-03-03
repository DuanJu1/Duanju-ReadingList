package com.duanju.testProgram;

import java.util.Random;

public class Programmer {
    public static void main(String[] args) {
        //打乱数组
        int[] arr={2,4,5,27,32,33};
        reserve(arr);
        printArr(arr);


    }

    public static int[] reserve(int[] arr){
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {

            int random=r.nextInt(arr.length);

            int temp=arr[random];
            arr[random]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }
}
