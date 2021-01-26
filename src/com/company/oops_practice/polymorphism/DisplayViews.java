package com.company.oops_practice.polymorphism;
public class DisplayViews {
    private static void display(int views) {
        System.out.println("displaying"+" "+views+" "+"views");
    }

    private static void display(String views) {
        System.out.println("displaying"+" "+views+" " +"views");
    }
    public static void main(String[] args) {
        DisplayViews displayViews = new DisplayViews();
        displayViews.display(4);
        displayViews.display("Good");

    }
}

