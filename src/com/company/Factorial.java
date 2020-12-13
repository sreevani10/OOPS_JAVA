package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int num,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number:");
        num = sc.nextInt();
        for(int inc=1;inc<=num;inc++)
        {
            fact=fact*inc;
        }
        System.out.println("Factorial of"+num+"is:"+fact);
    }
}
