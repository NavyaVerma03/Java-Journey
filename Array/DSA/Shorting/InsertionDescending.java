// Sort in Descending order using insertion sorting
package Array.DSA.Shorting;

import java.util.Arrays;

public class InsertionDescending {
    public static void main(String[] args) {
        int[] arr = {7,3,9,2,6,5};
        System.out.println("Array: "+ Arrays.toString(arr));

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Array: "+ Arrays.toString(arr));
    }
}
