// Write a Java program to count how many times a given element appears in an array using Linear Search.
package Array.PracticeQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 5, 7, 2, 3, 5, 9, 7, 5, 8, 8, 6, 1, 4};
        System.out.println("Array = " + Arrays.toString(arr));

        System.out.print("Enter the number to search: ");
        int e = sc.nextInt();

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == e){
                count++;
            }
        }

        System.out.println("Occurrence of " + e + " = " + count);
        sc.close();
    }
}
