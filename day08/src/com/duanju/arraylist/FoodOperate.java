package com.duanju.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类，负责菜品的上架和浏览
 */
public class FoodOperate {
    //同步创建集合对象
   private ArrayList<Food> foodList=new ArrayList<>();
   //foodList还是空

    //开发添加菜品
    public void addFood(){
        //创建一个菜品对象，封装一个菜品信息
        Food f=new Food();
        //录入菜品信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入菜品名称");
        String name= sc.next();
        f.setFood(name);

        System.out.println("请您输入菜品价格");
        double prive= sc.nextDouble();
        f.setPrice(prive);

        System.out.println("请您输入菜品描述");
        String desc= sc.next();
        f.setDesc(desc);

        //菜品存入集合
        foodList.add(f);

        System.out.println("上架成功");

    }

    //展示菜品
    public void showfood(){
        if (foodList.isEmpty()){
            System.out.println("没有上架菜品");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food food=foodList.get(i);
            System.out.println(food.getFood());
            System.out.println(food.getPrice());
            System.out.println(food.getDesc());
            System.out.println("--------------------------------");
        }
    }

    public void start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎使用菜单系统");
        while (true){
            System.out.println("1,上架");
            System.out.println("2,展示");
            System.out.println("3,关闭系统");
            String command=sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showfood();
                    break;
                case "3":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("您输入的命令不在");
            }


        }
    }

}
