package com.company;
class Dog {
    int size;
    String name;
    void bark() {
        System.out.println("barking");
    }
}
public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 20;
        d.name = "chocky";
        d.bark();
    }
}
