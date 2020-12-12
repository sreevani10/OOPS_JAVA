package com.company;
import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        int num,sum=0,rem,org;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        num = sc.nextInt();
        org=num;
        while(num>0){
            rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
        if(org==sum)
            System.out.println("ARMSTRONG");
        else
            System.out.println("NOT ARMSTRONG");
    }
}
