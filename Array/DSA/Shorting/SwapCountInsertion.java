// Swaps Count
package Array.DSA.Shorting;

import java.util.Arrays;

public class SwapCountInsertion {
    public static void main(String[] args) {
        int[] arr = {4,8,6,2,9};
        System.out.println("Array: "+ Arrays.toString(arr));
        int count = 0;
        for(int i = 1;i<arr.length-1;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                count++;
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Swap Count: "+ count);
        System.out.println("Array after ascending order: "+ Arrays.toString(arr));

    }
}
