package com.duanju.javaBean;

import com.duanju.javaBean.Student;

public class StudentOperate {
    private Student student;
    public StudentOperate(Student student) {
        this.student=student;
    }


    public void printPass(){
        System.out.println(student.getScore());
        System.out.println((student.getScore() >= 60 ? student.getName()+"成绩合格" : student.getName()+"成绩不合格"));
    }
}
