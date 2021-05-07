package array;
import java.util.Scanner;
public class Array2dInsertion {
    public static void main(String[] args) {
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements Length:");
        row=sc.nextInt();
        col=sc.nextInt();
        int array[][]=new int[row][col];
        System.out.println("Enter elements" + (row*col) + " are:");
        for(int index=0;index<row;index++){
            for(int index1=0;index1<col;index1++){
                array[index][index1]= sc.nextInt();
            }
        }
        System.out.println("Matrix is:\n");
        for(int index=0;index<row;index++){
            for(int index1=0;index1<col;index1++){
                System.out.print(array[index][index1]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter inserting element:");
        int addElement= sc.nextInt();
        array[row-2][col-2]= addElement;
        for(int index= 0;index>=row-2;index++){
            for(int index1=0;index1>=col-2;index1++){
                array[index][index1]=addElement;
            }
        }
        System.out.println("Matrix is:\n");
        for(int index=0;index<row;index++){
            for(int index1=0;index1<col;index1++){
                System.out.print(array[index][index1]+" ");
            }
            System.out.println();
        }
    }
}

