package com.duanju.define;

import java.util.Scanner;

public class DefineDemo4 {
    public static void main(String[] args) {
        //判断一个数是否为奇数还是偶数并输出
        Scanner sc=new Scanner(System.in);
        //System.out.println("输入一个数字，我将判断奇偶");
        //select(numOrigin);
        try{
            System.out.println("请输入一个整数");
            int numOrigin=sc.nextInt();
            checkOdden(numOrigin);
        }catch (Exception e){
            System.out.println("输入无效，请确保输入的为整数");
        }finally {
            sc.close();
        }
    }

    public static void checkOdden(int num){
        if (num%2!=0) {
            System.out.println("值为奇数");
        }else System.out.println("值为偶数");
    }
}
