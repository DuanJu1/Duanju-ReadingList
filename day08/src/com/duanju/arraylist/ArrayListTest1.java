package com.duanju.arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //购物车制作
        ArrayList<String> list=new ArrayList<>();
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("人之托");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("僵尸");
        list.add("上海枸杞");
        System.out.println(list);

        //遍历数据
        for (int i = 0; i < list.size(); i++) {
            String ele=list.get(i);
            if(ele.contains("枸杞")){
                //删除
                list.remove(ele);
                i--;
            }
        }
        System.out.println(list);
    }
}
