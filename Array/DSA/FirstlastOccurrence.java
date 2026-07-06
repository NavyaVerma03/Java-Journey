// Find the first and last occurrence of a given element in an array
package Array.DSA;

import java.util.Arrays;

public class FirstlastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,7,5,0,7,9,3,6,8,5,3};
        System.out.println("Array: "+ Arrays.toString(arr));

        int e = 7;

        int first = -1;
        int last = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == e){
                if(first == -1){
                    first = i;
                }
                last = i;
            }

        }
        if(first == -1){
            System.out.println("Element not Found!");

        } else {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }

}
