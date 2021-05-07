package com.company.oops_practice.polymorphism;

class MobileNumber{ // needs to be changed
    public void CreateContact(String name,int number1){
        System.out.println("one contact saved:"+name+ " " +number1);
    }
    public void CreateContact(String name,int number1,int number2){
        System.out.println("two contacts saved:"+name+" " +number1+" " +number2);
    }
}
public class ContactDemo {
    public static void main(String[] args) {
        MobileNumber calling = new MobileNumber();
    calling.CreateContact("sree",11111);
    calling.CreateContact("nandu",352728,7632833);
    }
}
