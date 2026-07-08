// Reverse an array.
package Array.PracticeQuestion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1)+" :");
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Array = [");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            if (i != size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
