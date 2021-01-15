package com.company.oops_practice;
class Car {
    private int noOfWheels;
    public void setNoOfWheels(int wheels)
    {
        noOfWheels =wheels;
    }
    public int getNoOfWheels()
    {
        return noOfWheels;
    }
}

public class CarEncapsulation {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNoOfWheels(5);
        System.out.println(car.getNoOfWheels());
    }
}
