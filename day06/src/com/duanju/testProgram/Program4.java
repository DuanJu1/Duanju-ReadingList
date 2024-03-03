package com.duanju.testProgram;

public class Program4 {
    public static void main(String[] args) {
        //完成数字加密程序的开发，每个数字+5，%10，再反转

        System.out.println(encrypt(1983));
    }

    public static String encrypt(int number) {
        // 明文1983，转为数组
        int[] numbers = split(number);

        //开始加密
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;//1983
            //6,4,3,8
        }

        //数组反转
        reverse(numbers);

        String screat = "";
        for (int i = 0; i < numbers.length; i++) {
            screat += numbers[i];
        }

        return screat;

    }

    public static void reverse(int[] numbers) {
        //[6,4,3,8]
        //交换
        for (int i = 0,j=numbers.length-1; i < j; i++,j--) {
            int temp=numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }

    }

    public static int[] split(int number) {
        //数字转换为数组
        //1983
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;

        return numbers;
    }
}

