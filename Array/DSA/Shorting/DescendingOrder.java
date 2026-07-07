// Sort the array in Descending Order using bubble sort.
package Array.DSA.Shorting;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {8,3,6,2,9};
        System.out.println("Array: "+ Arrays.toString(arr));

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting Descending Order: "+ Arrays.toString(arr));
    }
}
