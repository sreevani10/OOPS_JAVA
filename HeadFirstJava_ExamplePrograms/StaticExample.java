package com.company;
class Vani{
   static int i;
   int j;
   public static void eat(){
       System.out.println("Eating");
       System.out.println(i);
   }
}
public class StaticExample {
    public static void main(String[] args) {
        Vani.i=6;
        Vani.eat();
        Vani v = new Vani();
        v.j=5;
        System.out.println(v.j);

    }
}
