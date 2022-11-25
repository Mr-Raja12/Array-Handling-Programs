package com.bl.arrayproblems;
import java.util.Scanner;
public class SortAscendingOrder {
    public static void main(String[] args) {

        int array[] = new int[5];
        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array: ");

        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i=0; i<array.length; i++) {

            for (int j=i+1; j<array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sort Ascending order Elements:");

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
}