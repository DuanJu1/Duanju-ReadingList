package com.duanju.loop;

public class LoopNestedDemo {
    public static void main(String[] args) {
        /*for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.println("我爱你"+i);
            }
            System.out.println("-------------------");
        }*/

        for (int i = 1; i <=3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
