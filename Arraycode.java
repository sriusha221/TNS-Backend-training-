package com.tnsif.ArrayDemo;

public class Arraycode {

    public static void main(String[] args) {
        
        int[] arr = {2, 34, 5, 6, 23, 5, 99};
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Largest element: " + first);
            System.out.println("Second Largest element: " + second);
        }
    }
}
