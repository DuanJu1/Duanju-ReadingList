package com.duanju.string;

import java.util.Objects;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入用户名称");
        String userName = sc.next();
        System.out.println("请您输入用户密码");
        String userPassword = sc.next();
        loginName(userName, userPassword);
    }

    public static void loginName(String name, String password) {
        String[] names = {"张三", "李四", "高斯", "达芬奇", "莫扎特"};
        String[] pwds = {"1234567", "qweasd", "12dsaw", "mnbvcxz", "fhdsi23"};

        int attempts = 3;
        boolean loginSuccessful = false;

        Scanner sc = new Scanner(System.in);

        while (attempts > 0) {
            for (int i = 0; i < names.length; i++) {
                if (Objects.equals(name, names[i]) && Objects.equals(password, pwds[i])) {
                    System.out.println("密码正确");
                    loginSuccessful = true;
                    break;
                }
            }

            if (loginSuccessful) {
                break;
            } else {
                System.out.println("密码错误，还剩" + (--attempts) + "次");
                if (attempts == 0) {
                    System.out.println("账号锁定");
                    break;
                }

                System.out.println("请重新输入用户名称");
                name = sc.next();
                System.out.println("请重新输入用户密码");
                password = sc.next();
            }
        }
    }
}
