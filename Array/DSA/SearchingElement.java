// Search an element in an array using Linear Search
package Array.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.print("Enter element to search: ");
        int element = sc.nextInt();

       boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
               found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in Array.");

        } else {
            System.out.println("Element not found in Array!");
        }

    }
}
