// Print array by every pass
package Array.DSA.Shorting;

import java.util.Arrays;

public class PrintArrayByEveryPassInsertion {
    public static void main(String[] args) {

        int[] arr = {4, 8, 6, 2, 9};

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}