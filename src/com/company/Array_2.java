package com.company;

public class Array_2 {
    public void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Array_2 a = new Array_2();
        int []arr = {12,3,5,4,6,11};
        a.printArray(arr);
    }
}
