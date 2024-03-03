package com.duanju.object;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            students[i]=new Student();

            System.out.println("请输入第" + (i + 1) + "个学生的姓名:");
            students[i].name = sc.nextLine();

            System.out.println("请输入" + students[i].name + "的语文成绩:");
            students[i].Chinese = sc.nextDouble();

            System.out.println("请输入" + students[i].name + "的数学成绩:");
            students[i].Math = sc.nextDouble();

            // Consume the newline character left in the buffer
            sc.nextLine();
        }

        for (Student student:students){
            student.printTotalScore();
            student.printAverageScore();
        }


    }
}
