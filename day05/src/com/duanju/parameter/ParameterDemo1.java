package com.duanju.parameter;

public class ParameterDemo1 {
    public static void main(String[] args) {
        //理解方法的参数传递
        int[] arr=new int[]{11,22,33};
        change(arr);
        System.out.println("main"+arr[1]);

    }

    private static void change(int[] arr) {
        System.out.println("change 1:"+arr[1]);
        arr[1]=99;
        System.out.println("change 2:"+arr[1]);
    }
}
