package com.company;
class Working{
    public void display(int method){
        System.out.println("displaying:"+method);
    }
    public void display(int method ,String method1){
        System.out.println("displaying:"+method+" " +method1);
    }
}
public class Polymorphism_Test3 {
    public static void main(String[] args) {
        Working working=new Working();
        working.display(4);
        working.display(6,"HELLO");
    }
}
