// Write a Java program to find the largest element in an array using array traversal and print its value.

package Array.PracticeQuestion;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};
        System.out.println("Arrar = "+ Arrays.toString(arr));

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element: " + max);
    }
}
