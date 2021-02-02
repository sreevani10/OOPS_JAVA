package array;
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements Length:");
        int numbers=sc.nextInt();
        int digit[]=new int[numbers];
        System.out.println("Enter Elements are:");
        for(int index=0;index< digit.length;index++){
            digit[index]=sc.nextInt();
        }
        Arrays.sort(digit);
        System.out.println(Arrays.toString(digit));
        //System.out.println(Arrays.sort(digit));
    }
}

