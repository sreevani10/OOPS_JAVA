package com.company.oops_practice.polymorphism;
class Bike{
    public void run(){
        System.out.println("running...");
    }
}
class Splendor extends Bike{
    @Override
    public void run() {
        System.out.println("Safely running with 60kmph");
    }
}
public class TestingBikeSpeed {
    public static void main(String[] args) {
        Bike bike = new Splendor();
        bike.run();
    }
}


