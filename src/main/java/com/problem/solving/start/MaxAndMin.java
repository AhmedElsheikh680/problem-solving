package com.problem.solving.start;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        int []arr = new int [3];
        for (int i=0; i< 3; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i=0; i< 3; i++){
            if(arr[i] > max) {
                max = arr[i];
         }
            else if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " "+ max);
    }
}
