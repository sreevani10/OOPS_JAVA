package com.company.oops_practice;
class SmartPhone{
    public void CreateContact(String name,int number1){
        System.out.println("one contact saved:"+name+ " " +number1);
    }
    public void CreateContact(String name,int number1,int number2){
        System.out.println("two contacts saved:"+name+" " +number1+" " +number2);
    }
}
public class PolyExample {
    public static void main(String[] args) {
        SmartPhone smartPhone= new SmartPhone();
        smartPhone.CreateContact("sree",11111);
        smartPhone.CreateContact("nandu",352728,7632833);
    }
}
