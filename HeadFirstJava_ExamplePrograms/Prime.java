package com.company;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num, inc, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        num = sc.nextInt();
        for (inc = 1; inc < num / 2; inc++) {
            if (num % inc == 0) {
                count = count + inc;
            }
        }
            if (count == 2)
                System.out.println("prime");
            else
                System.out.println("not prime");
    }
}
