package com.company.oops_practice.abstraction;
abstract class Phone{
    public abstract void showConfig();
}
class OnePlus extends Phone {
    public void showConfig(){
        System.out.println("2gb,Ios,9.3");
    }
}
class Samsung extends Phone {
    public void showConfig(){
        System.out.println("3gb,Ios,4.5");
    }
}
public class MobileDetails {
    public static void main(String[] args) {
        OnePlus obj = new OnePlus();
        Samsung obj1 = new Samsung();
        show(obj);
    }
    public static void show(Phone obj){
        obj.showConfig();
    }
}


