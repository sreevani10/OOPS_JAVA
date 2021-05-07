package com.company.oops_practice.encapsulation;
class Student{
    private int studentId =7;
    private String studentName ="sri";
    public void setStudentId(int studentId)
    {
        this.studentId =studentId;
    }
    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentName()
    {
        return studentName;
    }
}
public class StudentDemo{
    public static void main(String[] args) {
        Student student = new Student();

        // getters
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());

        // setters
        student.setStudentId(4);
        student.setStudentName("divya");

        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
    }
}

