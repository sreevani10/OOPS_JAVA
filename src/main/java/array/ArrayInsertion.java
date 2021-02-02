package array;
import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        int numbers,pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements Length:");
        numbers=sc.nextInt();
        int arr[] = new int[numbers+1];
        System.out.println("Enter Elements are:");
        for(int index=0;index<numbers;index++){
            arr[index]= sc.nextInt();
        }
        System.out.println("Enter position");
        pos=sc.nextInt();
        System.out.println("Enter the element u want to add:");
        int element= sc.nextInt();
        for(int index= numbers-1;index>=pos-1;index--) {
            arr[index + 1] = arr[index];
        }
        arr[pos-1]=element;
        System.out.println("After inserting element");

        for(int index=0;index<numbers;index++) {
            System.out.println(arr[index]);
        }
        System.out.println(arr[numbers]);

    }

}


