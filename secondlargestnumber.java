package com.tnsif.ArrayDemo;

public class secondlargestnumber{
	
	public static void main(String[] args) {
		
		int []arr= {2,34,5,6,23,5,99};
		
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		
		for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}