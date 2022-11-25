package com.bl.arrayproblems;
public class SmallestElement {
	public static void main(String[] args) {

        int a[] = new int[] {300, 400, 100, 200, 900};
        int smallest = a[0];

        for (int i=0; i<a.length; i++) {

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println("Smallest element in given Array: " + smallest);
    }
}


