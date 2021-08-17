package com.problem.solving.start;

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        // Sorting Array
        for (int j=0; j<3; j++){
            int min = arr[j];
            int min_index = j;
            for (int i=j; i<3; i++){
                if(arr[i] < min){
                    min = arr[i];
                    min_index = i;
                }
            }
            // swapping arr[j], arr[min_index]
            int temp = arr[j];
            arr[j] = arr[min_index];
            arr[min_index] = temp;
        }

        for (int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        System.out.println("");


    }
}
