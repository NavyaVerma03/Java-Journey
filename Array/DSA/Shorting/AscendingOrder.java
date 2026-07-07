// Sort the array in ascending order using bubble shorting.

package Array.DSA.Shorting;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,7};
        System.out.println("Array: " + Arrays.toString(arr));

        for(int i = 0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println("Array after shorting Ascending Order: " + Arrays.toString(arr));
    }
}
