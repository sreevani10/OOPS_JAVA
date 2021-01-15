package com.company.logical_programs;

public class CheckIfelse {
    public static void main(String[] args){
        int a=4;
        int b=3;
        int c=8;
        if(a>b && a>c)
            System.out.println("A");
        else if(b>c)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
