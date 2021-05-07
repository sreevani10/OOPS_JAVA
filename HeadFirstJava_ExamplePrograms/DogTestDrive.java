package com.company;
class Dogs{
    String name;
    int size;
    void bark(){
        if(size>60){
            System.out.println("Woof!Woof!");
        } else if (size > 14) {
            System.out.println("Ruff!Ruff!");
        } else {
            System.out.println("Yip!Yip1");
        }
    }
}
public class DogTestdrive {
    public static void main(String[] args){
        Dogs one = new Dogs();
        one.size = 70;
        one.name = "jimmy";
        Dogs two = new Dogs();
        two.size = 8;
        two.name = "chocky";
        Dogs three = new Dogs();
        three.size = 35;
        three.name = "julie";
        one.bark();
        two.bark();
        three.bark();
    }
}
