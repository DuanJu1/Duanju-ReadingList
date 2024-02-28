package com.duanju.demo;

import java.util.*;

public class test {
    public static void main(String[] args) {
        //完成5个员工的随机排序

        
        //录入数据
        Scanner sc=new Scanner(System.in); 
        Integer[] codes=new Integer[5];
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第"+(i+1)+"位员工的工号");

            codes[i]=sc.nextInt();
        }

        List<Integer> codeList=new ArrayList<Integer>(Arrays.asList(codes));

        //遍历之前
        System.out.println("原来数据：");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"  ");
        }

        System.out.println();

        //遍历之后
        Random rand=new Random();
        Collections.shuffle(codeList,rand);

        System.out.println("现在数据：");
        for (int i = 0; i < codeList.size(); i++) {

            System.out.print(codeList.get(i)+"  ");
        }
    }
}
