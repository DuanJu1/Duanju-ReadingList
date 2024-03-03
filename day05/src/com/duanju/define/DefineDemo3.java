package com.duanju.define;

public class DefineDemo3 {
    public static void main(String[] args) {
        //设计一个1-n的和
        System.out.println(addNum(100));

    }

    public static int addNum(int n){
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }
}
