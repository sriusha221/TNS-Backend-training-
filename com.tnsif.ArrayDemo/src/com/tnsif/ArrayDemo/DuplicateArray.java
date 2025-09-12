package com.tnsif.ArrayDemo;

public class DuplicateArray {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 1, 2, 3, 45, 6, 75, 45, 8, 8, 6};
        
        System.out.print("Duplicate elements in the array: ");
        
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
        
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}
