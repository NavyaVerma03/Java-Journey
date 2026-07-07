// Count the totle number of swaps required to sort the array.
package Array.DSA.Shorting;

import java.util.Arrays;

public class SwapCount {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println("Array: " + Arrays.toString(arr));
        swap(arr);


    }

    public static void swap(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }

        System.out.println("Array after swaping: "+ Arrays.toString(arr));
        System.out.println("Swaping count: "+ count);
    }
}
