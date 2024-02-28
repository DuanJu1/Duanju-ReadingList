package com.duanju.define;

public class defineDemo2 {
    public static void main(String[] args) {
        prinfHelloword(5);
        System.out.println("------------------");
        prinfHelloword(3);
    }

    public static void prinfHelloword(int n){
        for (int i = 0; i <n; i++) {
            System.out.println("Hello World");
        }
    }
}
