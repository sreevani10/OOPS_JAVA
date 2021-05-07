package com.company;
class Parent{
    String name="sree";
    int age=20;
    public void method(){
        System.out.println("implented method");
    }
    public void method1(){
        System.out.println("implemented method1");
    }
}
class Child extends Parent{
    @Override
    public void method() {
        super.method();
    }

    @Override
    public void method1() {
        super.method1();
    }
    public void method2(){
        System.out.println("implementing method2");
    }
}
class Child2 extends Parent{
    @Override
    public void method1() {
        super.method1();
    }
    public void method3(){
        System.out.println("implementing method3");
    }

}
public class InheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        Child2 child2= new Child2();
        System.out.println(child.age);
        System.out.println(child.name);
        child.method1();
        child.method2();
        child.method();
        child2.method();
        child2.method3();
        child2.method1();
    }
}
