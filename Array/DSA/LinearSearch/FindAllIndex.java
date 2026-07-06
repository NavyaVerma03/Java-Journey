// Find all the indexes of a given element in an array
package Array.DSA.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,9,6,8,4,7,9,4,2,4,7,5,4,9,7,1,0,8,0,6,};
        System.out.println("Array: "+ Arrays.toString(arr));

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        System.out.print("Indexs: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                System.out.print(i + " ");

            }
        }

    }
}
