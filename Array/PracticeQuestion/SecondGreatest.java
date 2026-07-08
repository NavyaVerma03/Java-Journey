// Write a Java program to find the second largest element in an array.
package Array.PracticeQuestion;

import java.util.Arrays;

public class SecondGreatest {
    public static void main(String[] args) {
        int[] arr = {25, 10, 90, 45, 70};
        System.out.println("Array: "+ Arrays.toString(arr));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
