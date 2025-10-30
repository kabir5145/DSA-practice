package com.company;

public class Array_1 {
    public int[] arrayInsertion(int arr[], int pos, int newValue) {
        int n = arr.length;
        int newArr[] = new int[n + 1]; // new array with one extra space

        // copy elements before the position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // insert the new value
        newArr[pos] = newValue;

        // copy remaining elements after pos
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr; // return the new array
    }

    public static void main(String[] args) {
        Array_1 a = new Array_1();
        int arr[] = {1, 2, 3, 4, 5};

        int newArr[] = a.arrayInsertion(arr, 2, 99); // insert 99 at index 2

        // print the new array
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}

