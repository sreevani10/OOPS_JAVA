package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length: ");
        int len = sc.nextInt();
        int array[] = new int[len+1];
        System.out.println("Array Elements are:");
        for (int index=0;index<len;index++){
            array[index]=sc.nextInt();
        }
        for(int index=0;index<len;index++){
            System.out.println(array[index] + " ");
        }

        //   Array Insertion

        System.out.println("Insert element:");
        int Element = sc.nextInt();
        System.out.println("Insert position:");
        int Pos = sc.nextInt();

        for(int index= len-1;index>=Pos-1;index--){
            array[index+1]=array[index];
        }
        array[Pos-1] = Element;
        for(int index=0;index<len;index++){
            System.out.println(array[index]);
        }
        System.out.println(array[len]);


        //Array Sorting



        for(int index=0;index<array.length;index++){
            for(int index1=index+1;index1< array.length;index1++){
                if(array[index]>array[index1]){
                   int  temp=array[index];
                    array[index]=array[index1];
                    array[index1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Array Sorting:");
        for(int index=0;index< array.length;index++){
            System.out.println(array[index] + " ");
        }


        //Array Deletion

        System.out.println("Deleted element index position:");
        int pos = sc.nextInt();
        for(int index=pos;index<=len-1;index++){
            array[index] = array[index+1];
        }
        for(int index=0;index<len;index++){
            System.out.println(array[index]);
        }



        //Array Searching

        boolean flag=false;
        System.out.println("Enter searching element in array:");
        int key= sc.nextInt();

        int left=0,right= array.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(array[mid]==key){
                System.out.println("Element Found");
                flag=true;
                break;
            }
            if(array[mid]<key){
                left=mid+1;
            }
             if(array[mid]>key){
                right=mid-1;
            }
        }
        if(flag==false) {
            System.out.println("Element not found");
        }
    }
}
