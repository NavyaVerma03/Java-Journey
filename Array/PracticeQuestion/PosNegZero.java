// Write a Java program to count the number of positive, negative, and zero elements in an array.
package Array.PracticeQuestion;

import java.util.Arrays;

public class PosNegZero {
    public static void main(String[] args) {

        int[] arr = {10, -5, 0, 20, -8, 0, 15};
        System.out.println("Array: "+ Arrays.toString(arr));

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }

        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}
