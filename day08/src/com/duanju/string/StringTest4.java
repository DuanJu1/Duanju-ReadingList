package com.duanju.string;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        //写一个验证码
        Scanner sc=new Scanner(System.in);


        String generatedCode = createCode(4);
        System.out.println("生成的验证码: " + generatedCode);

        System.out.println("请输入4位验证码");


        for (int i=3;i>0;--i) {
            String code=sc.next();
            if(code.equalsIgnoreCase(generatedCode)){
                System.out.println("验证码正确");
                break;
            }else {
                System.out.println("验证码错误剩"+(i-1)+"次");
            }
        }


    }

     public static String createCode(int n){
         StringBuilder code = new StringBuilder();
         Random random = new Random();

         String charachers="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
         for (int i = 0; i < n; i++) {
             int index=random.nextInt(charachers.length());
             char randomChar=charachers.charAt(index);
             code.append(randomChar);
         }
         return code.toString();
     }

}
