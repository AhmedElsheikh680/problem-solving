package com.problem.solving.revision;

import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter Array Elements "+i);
            arr[i] = sc.nextInt();
        }
        // Sorting Array
        for(int j=0; j<size; j++){

            // get min arr[j] to end of array
            int min = arr[j];
            int min_index = j;
            for(int i=j;i<size;i++){
                if(arr[i] < min){
                    min = arr[i];
                    min_index = i;

                }
            }
            // swapping min, arr[min_index]
            int temp = arr[j];
            arr[j] = arr[min_index];
            arr[min_index] = temp;
        }


        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}
