// Find the index of a given element using Linear Search
package Array.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10, 20, 30, 40, 50};
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.print("Enter Element you want to search in Array: ");
        int e = sc.nextInt();

        int index = -1;
         for (int i =0; i < arr.length; i++){
             if (arr[i] == e){
                 index = i;
                 break;
             }

         }

         if (index != -1){
             System.out.println("Element Found at index " + index + " in Array.");
         } else{
             System.out.println("Element Not Found!");
         }
    }
}
