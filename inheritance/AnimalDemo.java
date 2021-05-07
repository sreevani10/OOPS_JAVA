package com.company.oops_practice.inheritance;
class Animal{
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    public void getNoOfLegs () {
        System.out.println("4");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
    }
    public void walk(){
        System.out.println("walking WITH 4 LEGS...");
    }
}

class Hen extends Animal {
    @Override
    public void sleep(){
        System.out.println("sleep");
    }

    @Override
    public void getNoOfLegs (){
        System.out.println("2");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Hen hen = new Hen();
        dog.eat();
        dog.walk();
        hen.sleep();
        hen.getNoOfLegs();
    }
}






