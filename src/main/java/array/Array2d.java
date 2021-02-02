package array;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements Length:");
        row= sc.nextInt();
        col= sc.nextInt();
        int data[][]=new int[row][col];

        System.out.println("Enter " +(row*col)+ " Elements are:");
        for(int index=0;index<row;index++){
            for(int index1=0;index1<col;index1++){
                data[index][index1]= sc.nextInt();
            }
        }
        System.out.println("Matrix is:\n");
        for(int index=0;index<row;index++){
            for(int index1=0;index1<col;index1++){
                System.out.print(data[index][index1]+" ");
            }
                System.out.println();
        }

    }
}
