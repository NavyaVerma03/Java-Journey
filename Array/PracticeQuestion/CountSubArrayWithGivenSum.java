// Write a Java program to count the number of subarrays whose sum is equal to a given target value.
package Array.PracticeQuestion;

import java.util.Scanner;

public class CountSubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1)+" :");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array = [");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            if (i != size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        System.out.println("Target Count: " + count);
    }
}
