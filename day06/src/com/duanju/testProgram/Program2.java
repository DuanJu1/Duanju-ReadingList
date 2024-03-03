package com.duanju.testProgram;

import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        //目标：生成验证码
        System.out.println(createCode(5));
    }

    public static String createCode(int n){
        Random r=new Random();
        String code="";
        for (int i = 1; i <=n; i++) {

            int type=r.nextInt(3);
            switch (type){
                case 0:
                    //随机一个数字
                    code+=r.nextInt(10);
                    break;
                case 1:
                    //随机一个大写字母 A65
                    char char1= (char) (r.nextInt(26)+65);
                    code+=char1;
                    break;
                case 2:
                    //随机一个小写字母 a97
                    char char2= (char) (r.nextInt(26)+97);
                    code+=char2;
                    break;
            }
        }
        return  code;
    }
}
