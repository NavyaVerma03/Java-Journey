// Count the number of occurrences of a given element in an array
package Array.DSA.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,7,8,6,8,4,2,2,9,8,6,4,0,6,3,7};
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.print("Enter Searching Element: ");
        int e = sc.nextInt();

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==e){
                count++;
            }
        }

        System.out.println("Number of Occurrences: " + count);

    }
}
