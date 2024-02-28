package com.duanju.define;

public class ArrayLearn1 {
    public static void main(String[] args) {
        //数组遍历
        int[] array={16,26,36,6,100};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("数据之和为："+sum);
    }
}
