package com.company;
class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof!Woof!");
        } else if (size > 14) {
            System.out.println("Ruff!Ruff!");
        } else {
            System.out.println("Yip!Yip");
        }
    }
}
public class GoodDogTestdrive {
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        GoodDog three = new GoodDog();
        three.setSize(35);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        System.out.println("Dog three: " + three.getSize());
        one.bark();
        two.bark();
        three.bark();
    }
}
