// Check if the array is sorted.
package Array;

import java.util.Scanner;

public class CheckShortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }

        System.out.print("Array = [");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]);
            if (i != s - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        boolean isShorted = true;
        for (int i = 0; i < s-1; i++) {
            if(arr[i]>arr[i+1]){
                isShorted = false;
                break;
            }
        }

        if (isShorted){
            System.out.println("Array is Shorted");
        } else {
            System.out.println("Array is Not Shorted");
        }
    }
}
