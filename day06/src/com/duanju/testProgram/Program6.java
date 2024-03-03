package com.duanju.testProgram;

import java.util.Random;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        //-个大V直播时发起了抢红包活动，分别有:9、666、188、520、99999五个红包。
        // 请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，
        // 注意:一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下(不一定是下面的顺序)
        int[] redPack={9,666,188,520,999};
        start(redPack);

    }

    public static void start(int[] moneys){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        for (int i = 1; i <=5; i++) {
            System.out.println("输入任意按键参与抽奖");

            while (true) {
                int index=r.nextInt(moneys.length);//0-4
                int money=moneys[index];
                sc.next();
                if(money!=0){
                    System.out.println("恭喜你抽中了红包"+money);
                    moneys[index]=0;
                    break;
                }else {
                    System.out.println("很可惜没哟");
                    System.out.println("再次输入任意按键参与抽奖！！！");
                }
            }
        }
    }
}
