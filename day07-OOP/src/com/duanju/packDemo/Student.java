package com.duanju.packDemo;

public class Student {
    Double score;
    public void thisPrint(){
        System.out.println(this);
    }

    public void printPass(double score){
        if(this.score>score){
            System.out.println("恭喜考上哈佛");
        }else System.out.println("遗憾落选");
    }
}
