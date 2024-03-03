package com.duanju.testProgram;

public class program5 {
    public static void main(String[] args) {
        //请把一个整型数组，例如存了数据:11，22，33，拷贝成一个一一样的新数组出来。
        int[] arr={11,22,33};
        int[] arrCopy=copuArr(arr);
        printArr(arrCopy);

    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }

    public static int[] copuArr(int[] arr){

        int[] copyArr=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i]=arr[i];
        }

        return  copyArr;

    }
}
