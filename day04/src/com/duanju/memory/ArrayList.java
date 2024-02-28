package com.duanju.memory;

public class ArrayList {
    public static void main(String[] args) {
        //多个数组指向同一个地址，栈存方法，堆存new出来的内容
        int[] arr=new int[]{11,22,33};
        int[] arr2=arr;

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println("----------------------");


        arr2[1]=99;
        System.out.println(arr[1]);


    }
}
