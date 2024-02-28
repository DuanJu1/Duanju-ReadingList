package com.duanju.define;



public class defineDemo1 {
    public static void main(String[] args) {
        int rs=sum(10,20);
        System.out.println("和为："+rs);

        int rs1=sum(1067,20);
        System.out.println("和为："+rs1);
    }

    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
