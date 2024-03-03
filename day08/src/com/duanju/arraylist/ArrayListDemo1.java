package com.duanju.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //学习Arraylist
        //ArrayList list=new ArrayList<>(); 没有标注性别的厕所
        ArrayList<String> list=new ArrayList<>();
        list.add("端桔");
        list.add("fsdf");
        list.add("duanju");
        System.out.println(list);


        //往集合中的位置添加一个数据
        list.add(1,"我是新加的");
        System.out.println(list);
        System.out.println("---------------------------------------");

        //获得数据
        String rs=list.get(1);
        System.out.println(rs);
        System.out.println("---------------------------------------");

        //输出大小
        System.out.println(list.size());
        System.out.println("---------------------------------------");

        //删除
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println("---------------------------------------");

        //删除重载，直接删除某个元素
        System.out.println(list.remove("duanju"));
        System.out.println(list);

        //设置
         System.out.println(list.set(1,"duanju是天帝"));
        System.out.println(list);
    }
}
