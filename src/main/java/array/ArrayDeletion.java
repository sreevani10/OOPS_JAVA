package array;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayDeletion {
    public static void main(String[] args) {
        int numbers;
        Scanner sc=new Scanner(System.in);
        System.out.println("Elements Length:");
        numbers= sc.nextInt();
        int data[]=new int[numbers];
        System.out.println("Enter Elements are:");
        for(int index=0;index<numbers;index++){
            data[index]=sc.nextInt();
        }
        System.out.println(Arrays.toString(data));
        System.out.println("Enter deleted number position:");
        int pos=sc.nextInt();
        for(int index=pos;index<numbers-1;index++){
            data[index]=data[index+1];
        }
        numbers=numbers-1;
        for(int index=0;index<numbers;index++) {
            System.out.println(data[index]);
        }

    }

}
