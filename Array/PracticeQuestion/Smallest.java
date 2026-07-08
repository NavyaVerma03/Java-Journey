// Write a Java program to find the smallest element in an array.
package Array.PracticeQuestion;

import java.util.Arrays;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {25, 10, 90, 45, 70};
        System.out.println("Array: "+ Arrays.toString(arr));

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }

        System.out.println("Smallest Element = " + smallest);
    }
}
