package com.duanju.demo;

import java.util.Scanner;

public class TextDemo {
    public static void main(String[] args) {
          /*目标:完成电影信息展示功能;根据电影id查询该电影详情。电影数据:
            1,“水门桥"，38.9，9.8，“徐克”，“吴京”，“12万人想看”" +
            "2，“出拳吧”，39，7.8，“唐晓白”，“田雨”,“3.5万人想看”" +
            "3,“月球陨落”，42，7.9，“罗兰”，，“贝瑞”，"17.9万人想看”
            4,"一点就到家"，35，8.7，“许宏字”，"刘吴然","10.8万人想看"*/

        //1、设计一个电影类
        //2、设计一个操作类
        //3、准备数据
        Movie[] movies=new Movie[4];

        movies[0]=new Movie(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        movies[1]=new Movie(2,"出拳吧",39,7.8,"唐晓白","田雨","3.5万人想看");
        movies[2]=new Movie(3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9万人想看");
        movies[3]=new Movie(4,"一点就到家",35,8.7,"许宏字","刘吴然","12万人想看");

        //4、对数据处理
        MovieOperate operate=new MovieOperate(movies);
       /* operate.printAllMovies();
        operate.searchMovieById(3);*/
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("===电影信息系统===");
            System.out.println("1、查询全部信息");
            System.out.println("2、根据id查询某个电影的详细信息");
            System.out.println("请您输入操作命令");
            int commom= sc.nextInt();
            switch (commom){
                case 1:
                    //展示全部电影
                    operate.printAllMovies();
                    break;

                case 2:
                    System.out.println("输入您要查询的id");
                    int id=sc.nextInt();
                    operate.searchMovieById(id);
                    break;

                default:
                    System.out.println("输入的数字有问题");
            }
        }

    }
}
