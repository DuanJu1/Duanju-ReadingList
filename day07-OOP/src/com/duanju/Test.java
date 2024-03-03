package com.duanju;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);
        //2.获取键盘录入的大于100的整数数字,保存int变量maxValue
        System.out.println("请输入大于100的三位整数数字: ");
        int maxValue = sc.nextInt();
        //3.定义int变量count,初始值0,用来统计个数
        int count = 0;
        //4.定义int变量sum,初始值0,用来累加求和
        int sum = 0;
        //5.使用for循环获取10到maxValue之间的数字,循环变量int类型num
        for (int num = 100; num <= maxValue; num++) {
            //5.1 判断num中的数字如果满足条件
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            if ((ge != 7) && (shi != 5) && (bai != 3)) {
                //5.2 输出满足条件的当前数字
                System.out.println(num);
                //5.3 把满足条件的当前数字累加到求和变量sum中
                sum += num;
                //5.4 计数器count的值增加1
                count++;
            }
        }
        //6.for循环结束,输出结果数据
        System.out.println("以上满足条件的数字之和: " + sum);
        System.out.println("以上满足条件的数字个数: " + count);
    }
}
