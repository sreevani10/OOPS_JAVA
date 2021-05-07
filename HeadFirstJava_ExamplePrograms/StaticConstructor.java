package com.company;
class Testing{
    static int i;
    static {
        i=6;
        System.out.println("static block called");
    }
    Testing(){
        System.out.println("constructor called");
    }
}
public class StaticConstructor {
    public static void main(String[] args) {
        Testing g = new Testing();
        Testing g1 = new Testing();
    }
}
