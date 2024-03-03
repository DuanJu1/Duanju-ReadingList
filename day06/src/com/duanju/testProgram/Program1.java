package com.duanju.testProgram;

public class Program1 {
    public static void main(String[] args) {
        //案例1，用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
        // 优惠方案如下:5-10月为旺季，头等舱9折，经济舱8.5折;11月到来年4月为淡季，
        // 头等舱7折，经济舱6.5折请开发程序计算出用户当前机票的优惠价。
        System.out.println(buyPlane(6, "经济舱", 1000));

    }
    public static double buyPlane(int month,String sit,double price) {
        if (month >= 5 && month <= 10) {
            //旺季
            switch (sit) {
                case "头等舱":
                    price *= 0.9;
                case "经济舱":
                    price *= 0.85;
            }
        } else {
            switch (sit) {
                case "头等舱":
                    price *= 0.7;
                case "经济舱":
                    price *= 0.65;
            }

        }
        return price;
    }
}
