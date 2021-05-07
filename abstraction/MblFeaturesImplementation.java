package com.company.oops_practice.abstraction;
abstract class MaheshPhone{
    public void call(){
        System.out.println("calling....");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void sing();
}
abstract class RameshPhone extends MaheshPhone {
    public void move(){
        System.out.println("moving...");
    }
}
class SureshPhone extends RameshPhone {
    public void dance(){
        System.out.println("dancing...");
    }
    public void sing(){
        System.out.println("singing...");
    }
}
public class MblFeaturesImplementation {
    public static void main(String[] args) {
        MaheshPhone phone = new SureshPhone(); {
            phone.call();
            phone.dance();
            phone.move();
            phone.sing();
        }
    }
}

