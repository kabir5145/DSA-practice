package com.company;

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
        public void reverseArray(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Array_2 a = new Array_2();
            a.reverseArray(arr,0,arr.length-1);
            System.out.println("The reversed array is : ");
            for(int x : arr){
                System.out.print(x+" ");
            }
        }
    }

