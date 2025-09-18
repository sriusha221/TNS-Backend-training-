package com.tnsif.ArrayDemo;

public class ReverseArray {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nReversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
