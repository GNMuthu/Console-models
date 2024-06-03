package com.gnmuthu.schoolManagement;

public class Student
{
    private int id;
    private String studentName;
    private int studentGrade;
    private int feePaid;
    private int feeTotal;

    public Student(int id, String studentName, int studentGrade){
        this.id = id;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        feePaid = 0;
        feeTotal = 25000;
    }
}
