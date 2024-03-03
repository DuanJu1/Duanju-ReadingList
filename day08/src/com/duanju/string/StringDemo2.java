package com.duanju.string;

public class StringDemo2 {
    public static void main(String[] args) {
        //String API的学习
        String s="端桔Java";

        //1.获取字符串的长度
        System.out.println(s.length());

        //2.提取字符串的位置
        char c=s.charAt(1);
        System.out.println(c);

        //3.输出每个位置的字符
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            System.out.println(ch);
        }

        System.out.println("========================================");

        //4.将String内容以数组记录
        char[] arr=s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //5.判断字符串内容
        String s1=new String("duanju");
        String s2=new String("duanju");
        //为什么不一样的，因为new出来的值在堆空间，他们在不同的堆空间中，取出来到方法的是索引堆空间的地址，自然是不一样的
        //需要取值要又equal的方法
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println("========================================");

        //6.忽略大小写来判断相等
        String c1="SE3rn";
        String c2="Se3rn";
        System.out.println(c1.equals(c2));//false,内容需要一样
        System.out.println(c1.equalsIgnoreCase(c2));//true,忽略大小写

        System.out.println("========================================");

        //7.截取一段内容
        String d1="java是世界上最好的语言之一";
        System.out.println(d1.length());
        System.out.println(d1.substring(0, 11));//截取了0-11的字符java是世界上最好的

        //8.从当前位置一直截取到字符串的末尾
        System.out.println(d1.substring(8));

        System.out.println("========================================");

        //9.替换字符串中的单纯
        String e1="这个电影真是太垃圾了，垃圾！！";
        String e2=e1.replace("垃圾","口口");
        System.out.println(e2);

        System.out.println("========================================");

        //10.判断一段话有没有关键字
        String f1="Java是世界上最好的语言，我爱Java，Java不爱我";
        System.out.println(f1.contains("Java"));
        System.out.println(f1.contains("语言"));
        System.out.println(f1.contains("java2"));

        System.out.println("========================================");

        //11.判断字符串是不是以某个字符串开头，常用于查找名字
        String g1="端桔2号机";
        System.out.println(g1.startsWith("端"));
        System.out.println(g1.startsWith("端桔"));
        System.out.println(g1.startsWith("端桔1"));

        System.out.println("========================================");

        //12.把字符串中的指定内容切分，放到一个数组中给我们
        String name="张无忌，殷素素，张山丰，赵敏";
        String[] name1=name.split(",");
        for (int i = 0; i < name1.length; i++) {
            System.out.println(name1[i]);
        }


    }
}
