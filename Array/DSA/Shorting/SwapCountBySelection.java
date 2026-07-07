// Count Total swaps using selection sorting
package Array.DSA.Shorting;

import java.util.Arrays;

public class SwapCountBySelection {
    public static void main(String[] args) {
        int[] arr = {7,5,3,1};
        System.out.println("Array: " + Arrays.toString(arr));
        array(arr);

    }
    public static void array(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                count++;
            }

        }
        System.out.println("Swaps Count: "+ count);
        System.out.println("Array after Sorting: " + Arrays.toString(arr));
    }
}
