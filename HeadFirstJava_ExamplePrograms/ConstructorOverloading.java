package com.company;
class Machine{
    public Machine(){
        System.out.println("Reading");
    }
    public Machine(int i){
        System.out.println("Writing");
    }
    public  Machine(int i,double d){
        System.out.println("Reading,Writing");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Machine m = new Machine(5,6.6);
    }
}
