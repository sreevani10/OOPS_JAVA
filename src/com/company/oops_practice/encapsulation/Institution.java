package com.company.oops_practice.encapsulation;
class DataFlair{
    private String course;
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return course;
    }
}

public class Institution {
    public static void main(String[] args) {
        DataFlair df = new DataFlair();
        df.setCourse("Java");
        System.out.println(df.getCourse());
    }
}

