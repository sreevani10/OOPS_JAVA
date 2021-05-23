package com.company;


public class Runner {
    public static void main(String[] args) {

        Stack number = new Stack();

        number.push(5);
        number.show();
        number.push(8);
        number.show();
        number.push(2);
        number.show();
        number.push(19);
        number.show();
        number.push(6);
        number.show();
        number.push(9);
        number.show();
        System.out.println(number.pop());
        System.out.println(number.peek());
        System.out.println("Size is :" + number.size());
        System.out.println("Empty:" + number.isEmpty());

        number.show();
    }
}




