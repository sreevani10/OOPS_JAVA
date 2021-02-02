package array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of elements:");
        int number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter Elements are:");
        for (int index=0;index<number;index++) {
            arr[index] = sc.nextInt();
        }
        //print the array elements
        for(int index=0;index<number;index++){
            System.out.println((arr[index]));
        }
        System.out.println(Arrays.toString(arr));
    }
}


