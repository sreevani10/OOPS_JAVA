package com.company.oops_practice;
class Shape{
    public void area(){
        System.out.println("Area");
    }
}

class Triangle extends Shape{

    private final int width;
    private final int height;


    public Triangle(int width ,int height){
        this.width = width;
        this.height = height;
    }

    public void area() {
        System.out.println("Area =" +(width*height));
    }

    public void getNoOfSides() {
        System.out.println(3);
    }
}
class Circle extends Shape{
    private final int radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        super.area();
        System.out.println("Area =" +(3.14*radius*radius));
    }
    public void getNoOfSides() {
        System.out.println(0);
    }
}
class Rectangle extends Shape{
    @Override
    public void area() {
        super.area();
    }
}
public class InheritanceExanple {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,3);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle();
        triangle.area();
        triangle.getNoOfSides();
        circle.area();
        circle.getNoOfSides();
        rectangle.area();

    }
}
