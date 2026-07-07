// Descending order using by selection sorting
package Array.DSA.Shorting;

import java.util.Arrays;

public class DescendingOrderBySelection {
    public static void main(String[] args) {
        int[] arr = {5,1,8,3,2};
        System.out.println("Array: " + Arrays.toString(arr));
        array(arr);


    }

    public static void array(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max]){
                    max=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
