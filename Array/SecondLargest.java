// Find the second largest element in an array.

package Array;

import java.util.Scanner;

public class SecondLargest{
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

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < s; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            }
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The Second Largest element in the array is: " + secondLargest);
    }

}
