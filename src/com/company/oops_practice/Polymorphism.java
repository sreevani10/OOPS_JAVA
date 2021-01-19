package com.company.oops_practice;
class Mobile {
    public void call(){
        System.out.println("calling...");
    }
    public void camera(){
        System.out.println("capturing ");
    }
    public void os(){
       System.out.println("system");
    }
}
class Vivo extends Mobile{
    @Override
    public void call() {
        super.call();
    }
    public void os (){
        System.out.println("Android");
    }
}
class Iphone extends Mobile{
    @Override
    public void call() {
        super.call();
    }
    public void camera() {
        super.camera();
    }
    public void os(){
        System.out.println("Mac");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Mobile vivo = new Vivo();
        Mobile iphone = new Iphone();
        mobile.call();
        vivo.camera();
        vivo.os();
        iphone.camera();
    }

}
