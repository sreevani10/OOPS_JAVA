package com.company.logical_programs;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        int num,inc,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiplication table num:");
        num = sc.nextInt();
        for(inc=1;inc<=num;inc++)
        {
            res=num*inc;
           System.out.println(num+"*"+inc+"="+res);
        }
    }
}
