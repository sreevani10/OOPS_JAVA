package com.company.oops_practice.polymorphism;
class Details{
    public void StudentInformation(String loc,int age,int phonenum){
        System.out.println("student information:"+loc+" "+age+" "+phonenum);
    }
    public void StudentInformation(String loc,int age,int phonenum,int aadharcardno){
        System.out.println("updated student information:"+loc+" "+age+" "+phonenum+" "+aadharcardno);;
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Details details = new Details();
        Details details1 = new Details();
        details.StudentInformation("Araku", 19, 8430179);
        details.StudentInformation("kerala", 20, 93259039, 88820230);
        details1.StudentInformation("jaipur", 17, 8359702);
    }
}



