package array;
import java.util.Arrays;
import java.util.Scanner;

public class CopyingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Elements Length:");
        int numbers= sc.nextInt();
        int array[]=new int[numbers];
        int newArray[] = new int[4];
        System.out.println("Enter Elements are:");
        for(int index=0;index<numbers;index++){
            array[index]= sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for(int index=0;index<numbers;index++){
            newArray[index]=array[index];
        }
        System.out.println(Arrays.toString(newArray));

    }
}

