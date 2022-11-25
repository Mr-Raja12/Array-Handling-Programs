package com.bl.arrayproblems;

public class EvenPosition {
	public static void main(String[] args) {

        int arr[] = new int[] {5,4,6,5,8,4,5,8,9};
        System.out.println("Elements of given array present on even position:");

        for (int i=1; i<arr.length; i=i+2) {
            System.out.println(arr[i]);
        }
    }
}


