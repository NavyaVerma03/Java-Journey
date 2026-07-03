//Write a Java program to search for a given element in an array using Linear Search. If the element is found, print its index; otherwise, print "Element not found".

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.print("Enter element to search: ");
        int e = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}