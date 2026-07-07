// Ascending Order using Slection Sorting
package Array.DSA.Shorting;

import java.util.Arrays;

public class AscendingBySlectionSorting {
    public static void main(String[] args) {
        int[] arr = {29,10,14,37,13};
        System.out.println("Array: " + Arrays.toString(arr));
        array(arr);
    }
    public static void array(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
