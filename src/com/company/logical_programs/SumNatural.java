package com.company.logical_programs;
import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args){
        int num,inc=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of SumNaturals:");
        num = sc.nextInt();
        for(inc=1;inc<=num;inc++)
        {
            sum=sum+inc;
        }
        System.out.println("Sum="+ sum);
    }
}
