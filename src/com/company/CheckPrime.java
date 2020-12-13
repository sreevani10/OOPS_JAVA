package com.company;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        num = sc.nextInt();
        for(int n=2;n<num/2;n++)
        {
            if(num%n==0)
                System.out.println("not prime");
            else
                System.out.println("prime");
        }
    }
}
