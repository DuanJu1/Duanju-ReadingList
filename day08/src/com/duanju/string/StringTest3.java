package com.duanju.string;

import java.util.Objects;
import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //用控制台完成登录操作，用户有三次登录机会，三次失败账号锁定
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入用户名称");
        String useNames=sc.next();
        System.out.println("请您输入用户密码");
        String usePassword=sc.next();
        loginName(useNames,usePassword);

    }

    public static void loginName(String name,String usePassword){

        String[] names={"张三","李四","高斯","达芬奇","莫扎特"};
        String[] pwds={"1234567","qweasd","12dsaw","mnbvcxz","fhdsi23"};

        Scanner sc=new Scanner(System.in);
        int attemptAble=3;
        boolean loginSuccessful=false;


        while (attemptAble>0) {
            for (int i = 0; i < names.length; i++) {
                if(Objects.equals(name, names[i]) && Objects.equals(usePassword, pwds[i])){
                    System.out.println("密码正确");
                    loginSuccessful=true;
                    break;
                }
            }

            if (loginSuccessful){
                break;
            }else {
                System.out.println("密码还剩"+(--attemptAble)+"次");
                if (attemptAble==0){
                    System.out.println("账号锁定");
                    break;
                }
                System.out.println("请您重新输入用户名称:");
                name= sc.next();
                System.out.println("请您重新输入用户密码:");
                usePassword=sc.next();

            }



        }





    }
}
