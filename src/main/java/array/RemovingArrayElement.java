package array;
import java.util.Arrays;
import java.util.Scanner;

public class RemovingArrayElement {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        int numbers;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Elements length:");
        numbers=scanner.nextInt();
        int arr[]=new int[numbers];
        System.out.println("Enter Elements are:");
        for(int index=0;index<numbers;index++){
            arr[index]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Removing Element Position:");
        int removeIndex=scanner.nextInt();
        for(int index=removeIndex;index< arr.length-1;index++){
            arr[index]=arr[index+1];
        }
        numbers=numbers-1;
        for(int index=0;index<numbers;index++){
            System.out.println(arr[index]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

