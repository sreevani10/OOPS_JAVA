package com.company;
public class Polymorphism_Test4 {
    private static void display(int views) {
        System.out.println("displaying"+" "+views+" "+"views");
    }

    private static void display(String views) {
        System.out.println("displaying"+" "+views+" " +"views");
    }
    public static void main(String[] args) {
        Polymorphism_Test4 polyTest4 = new Polymorphism_Test4();
        polyTest4.display(4);
        polyTest4.display("Good");

    }
}
