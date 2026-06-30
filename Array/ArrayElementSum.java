// Find the sum of all elements in an array.
package Array;

import java.util.Scanner;

public class ArrayElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        int sum = 0;

        for (int i = 0; i < s; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();

        }

        System.out.print("Array = [");
        for (int i = 0; i < s; i++) {
            sum += arr[i];
            System.out.print(arr[i]);
            if(i != s-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("The sum of the elements in the array is: " + sum);


    }
}
