package com.problem.solving;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            int value = sc.nextInt();
            if(value ==0){
                System.out.println(0);
                continue;
            }
            while(value !=0){
                int num = value %10;
                System.out.print(num + " ");
                value /=10;
            }
            System.out.println();
        }


    }
}
