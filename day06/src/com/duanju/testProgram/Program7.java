package com.duanju.testProgram;

public class Program7 {
    public static void main(String[] args) {
    //收索查找素数
        System.out.println(search(1, 200));
    }

    public static int search(int a,int b){
        //a=101  b=200
        int cout=0;//初始化数量
        for (int i = a; i <=b ; i++) {
            //i==101 102 103 104
            boolean flag=true;
            for (int j = 2; j <=i/2 ; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                cout++;
            }

        }
            return cout;
    }
}
