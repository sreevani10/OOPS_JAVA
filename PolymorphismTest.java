package com.company;
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
public class PolymorphismTest {
    public static void main(String[] args) {
        Splendor splendor = (Splendor) new Bike();
        splendor.run();
    }
}
