// Write a Java program to find the second smallest element in an array.
package Array;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {25, 10, 90, 45, 70};
        System.out.println("Array: "+ Arrays.toString(arr));

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }

        }

        System.out.println("Second Smallest = " + secondSmallest);
    }
}
