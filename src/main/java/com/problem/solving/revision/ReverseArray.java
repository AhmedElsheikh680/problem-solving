package com.problem.solving.revision;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        sc.nextLine();
        char[] arr = new char[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter Array Elements: ");
           String str =  sc.nextLine();
           arr[i] = str.charAt(0);
        }
        for(int i=0, j = size-1; i<size/2; i++,j--){
//            int j = size-1;
            // swap arr[i] , arr[j]
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
//            j--;

        }
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}

/*
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        sc.nextLine();
        char []arr = new char[size];
        char []reverse_arr = new char[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter Elements: ");
            String str = sc.nextLine();
            arr[i] = str.charAt(0);
        }
//        int j=0;
        for(int i=size-1, j=0; i>=0; i--, j++){
            reverse_arr[j] = arr[i];
//            j++;
        }
        for (int i=0; i<size; i++){
            System.out.println(reverse_arr[i]);
        }
 */
