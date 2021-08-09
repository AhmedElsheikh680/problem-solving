package com.problem.solving.revision;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int [] x = new int [size];
        for(int i=0; i< x.length; i++){
            System.out.println("Enter Number: "+ i);
            x[i] =sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<x.length; i++){
            sum +=x[i];
        }
        System.out.println("Sum: " + sum);
    }
}
