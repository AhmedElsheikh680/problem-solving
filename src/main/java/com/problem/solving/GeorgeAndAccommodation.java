package com.problem.solving;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int counter =0;
        for(int i=0; i<size; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num2 - num1 >=2){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
