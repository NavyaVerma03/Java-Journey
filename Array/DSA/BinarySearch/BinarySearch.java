// Search a given element in a sorted array using Binary Search.
package Array.DSA.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Array: " + Arrays.toString(arr));

        int target = 20;
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end-start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element Found at Index: " + mid);
                return;

            }

            if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element Not Found!");
    }
}
