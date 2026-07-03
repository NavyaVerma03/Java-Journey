// Write a Java program to count the number of even and odd elements in an array.
package Array;

import java.util.Arrays;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {10, 21, 30, 41, 50, 63};
        System.out.println("Array: "+ Arrays.toString(arr));

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}
