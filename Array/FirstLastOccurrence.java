// Write a Java program to find the first and last occurrence of a given element in an array. If the element is not present, print an appropriate message.
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 5, 8, 6, 7, 2, 6, 8, 5, 3, 2, 9, 6, 5, 9, 7, 8};
        System.out.println("Array = " + Arrays.toString(arr));

        System.out.print("Enter the number to search: ");
        int e = sc.nextInt();

        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first != -1 ) {
            System.out.println("First Occurrence index: " + first);
            System.out.println("Last Occurrence index: " + last);
        } else {
            System.out.println("Element not found!");
        }
        sc.close();
    }
}
