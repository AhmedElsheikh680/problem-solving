package com.problem.solving.testing;


import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int size = s.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter Element "+ i);
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i=0; i<size; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
