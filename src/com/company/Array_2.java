package com.company;

import java.util.Arrays;

public class Array_2 {
    /*
}
    public void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 */
    /*
        public void reverseArray(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
     */

    public void maxAndMin(int []arr){
        int max = arr[0];
        int min=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            } else if (min>arr[i]) {
                min=arr[i];
            }
        }
        //Print the array
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
            System.out.println("The maximum number in this array is : "+max);
            System.out.println("The minimum number in this array is : "+min);
    }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Array_2 a = new Array_2();
            /*
            a.reverseArray(arr,0,arr.length-1);
            System.out.println("The reversed array is : ");
            for(int x : arr){
                System.out.print(x+" ");
            }
             */
            a.maxAndMin(arr);
        }
    }

