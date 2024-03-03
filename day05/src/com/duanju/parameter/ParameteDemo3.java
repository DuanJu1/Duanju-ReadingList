package com.duanju.parameter;

import java.util.Scanner;

public class ParameteDemo3 {
    public static void main(String[] args) {
        //判断两个数组是不是一样
        int[] arr1={11,22,33};
        int[] arr2={11,22,332};

        boolean result=CheckArr(arr1,arr2);

        if (result){
            System.out.println("两数组相同");
        }else System.out.println("数组不同");

    }

    public static boolean CheckArr(int[] arr1,int[] arr2){

        if(arr1==null&&arr2==null){
            return true;
        }

        if (arr1==null||arr2==null)
            return false;

        if(arr1.length==arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }


    }
}
