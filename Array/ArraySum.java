// Write a Java program to find the sum of all elements in an array.
package Array;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50};
        System.out.println("Array: " + Arrays.toString(arr));
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        System.out.println("Array Sum: " + sum);
    }
}
