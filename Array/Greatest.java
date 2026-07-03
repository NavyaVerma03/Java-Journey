// Write a Java program to find the largest element in an array.
package Array;

import java.util.Arrays;

public class Greatest {
    public static void main(String[] args) {
        int[] arr = {25, 10, 90, 45, 70};
        System.out.println("Array: "+ Arrays.toString(arr));

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        System.out.println("Largest Element = " + largest);
    }

}
