package com.company.oops_practice.polymorphism;

class Calling{
    public void CreateContact(String name,int number1){
        System.out.println("one contact saved:"+name+ " " +number1);
    }
    public void CreateContact(String name,int number1,int number2){
        System.out.println("two contacts saved:"+name+" " +number1+" " +number2);
    }
}
public class ContactDetails {
    public static void main(String[] args) {
        Calling calling = new Calling();
    calling.CreateContact("sree",11111);
    calling.CreateContact("nandu",352728,7632833);
    }
}
