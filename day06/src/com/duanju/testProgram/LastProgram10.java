package com.duanju.testProgram;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LastProgram10 {
    public static void main(String[] args) {
        //双色球案例
        //7个球，6个红一个蓝
        int[] userNumbers = userSelectNumbers();
        int[] luckNumbers=createLuckNumbers();
        System.out.println("选择的号码为" + Arrays.toString(userNumbers));
        System.out.println("幸运号码为" + Arrays.toString(luckNumbers));
        judge(userNumbers,luckNumbers);

    }

    public static int[] userSelectNumbers() {
        //用户数组
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //前面6个输入红球
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请您输入第" + (i + 1) + "个红色的号码(1-33不能重复)");
                int number = sc.nextInt();
                if (number < 1 || number > 33) {
                    System.out.println("您输入的红球号码不在1-33之间 ");
                } else {
                    if (exit(numbers, number)) {
                        System.out.println("红球号码之前选择过，重复了");
                    } else {
                        numbers[i] = number;
                        break;//结束死循环
                    }
                }

            }
        }
        while (true) {
            System.out.println("请您输入最后一个篮球号码（1-16）：");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您输入的篮球号吗范围不在1-16之间");
            } else {
                numbers[6] = number;
                break;
            }
        }


        return numbers;

    }

    public static boolean exit(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] createLuckNumbers() {
        Random r = new Random();
        //创建一个整型数组来存储7个数字
        int[] luckNumbers = new int[7];

        for (int i = 0; i < luckNumbers.length - 1; i++) {
            while (true) {
                int luckNumber = r.nextInt(33) + 1;
                //1-33随机数字
                if (!exit(luckNumbers, luckNumber)) {
                    luckNumbers[i] = luckNumber;
                    break;
                }
            }
        }

        luckNumbers[6] = r.nextInt(16) + 1;
        return luckNumbers;

    }

    public static void judge(int[] useNumbers,int[] luckNumbers){
        int redCound=0;
        int buleCound=0;


        //查找红色
        for (int i = 0; i < useNumbers.length-1; i++) {
            //遍历中奖号码
            for (int j = 0; j < luckNumbers.length-1; j++) {
                if(useNumbers[i]==luckNumbers[j]){
                    redCound++;
                    break;
                }
            }
        }

        //判断蓝色
        buleCound=useNumbers[6]==luckNumbers[6]?1:0;

        System.out.println("红球猜中数量："+redCound);
        System.out.println("蓝球猜中数量："+buleCound);

        if(redCound==6&&buleCound==1){
            System.out.println("1等奖，获得1000万");
        }else if (redCound==6&&buleCound==0){
            System.out.println("2等奖，获得500万");
        }else if (redCound==5&&buleCound==1){
            System.out.println("3等奖，获得3000元");
        }else if (redCound==5&&buleCound==0||redCound==4&&buleCound==1){
            System.out.println("4等奖，获得200元");
        }else if (redCound==4&&buleCound==0||redCound==3&&buleCound==1){
            System.out.println("5等奖，获得10元");
        }else if ((redCound>0&&redCound<3)||buleCound==1){
            System.out.println("6等奖，获得5元");
        }else {
            System.out.println("谢谢参与");
        }
    }
}

