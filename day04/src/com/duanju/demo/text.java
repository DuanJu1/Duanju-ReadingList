package com.duanju.demo;

public class text {
    public static void main(String[] args) {
        //数组反转
        int[] arr={10,20,30,40,50};
        for (int i = 0,j= arr.length-1; i <j ; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
