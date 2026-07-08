// Write a Java program to left rotate an array by one element.
package Array.PracticeQuestion;

import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int s = sc.nextInt();

        int[]  arr = new int[s];

        for(int i=0;i<s;i++){
            System.out.print("Enter Array Elements "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Before Rotating: [ ");
        for(int i=0;i<s;i++){
            System.out.print(arr[i]);
            if(i!=s-1){
                System.out.print(", ");
            }

        }
        System.out.println("]");

        int temp = arr[0];
        for(int i=0;i<s-1;i++){
            arr[i] = arr[i+1];
        }
        arr[s-1] = temp;

        System.out.print("Array After Left Rotating By One : [");
        for(int i=0;i<s;i++) {
            System.out.print(arr[i]);
            if (i != s - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
