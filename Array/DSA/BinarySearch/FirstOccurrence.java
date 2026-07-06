// Find the first occurrence of a given element in a sorted array using Binary Search.
package Array.DSA.BinarySearch;

import java.util.Arrays;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Array: " + Arrays.toString(arr));
        int target = 30;
        System.out.println("Target: " + target);

        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (index != -1) {
            System.out.println("First Occurrence index: " + index );
        } else {
            System.out.println("Element not found");
        }
    }
}
