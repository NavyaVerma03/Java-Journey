// Read an array of N integers and print all elements.

package Array.PracticeQuestion;

import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
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
    }

}
