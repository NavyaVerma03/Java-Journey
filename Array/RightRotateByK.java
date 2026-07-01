// Write a Java program to right rotate an array by K elements.
package Array;

import java.util.Scanner;

public class RightRotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter Array Elements " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Before Rotating  : [ ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]);
            if (i != s - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");

        System.out.print("Enter Rotate term: ");
        int k = sc.nextInt();
        k = k % s;
        for (int j = 0; j < k; j++) {
            int temp = arr[s-1];
            for (int i = s-1; i >0; i--) {
                arr[i] = arr[i -1];
            }
            arr[0] = temp;
        }

        System.out.print("Array After " + k + " time Right Rotating: [");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]);
            if (i != s - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
