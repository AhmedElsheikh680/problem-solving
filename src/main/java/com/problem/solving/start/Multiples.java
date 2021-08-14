package com.problem.solving.start;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Multiples");
        } else {
            System.out.println("No Multiples");
        }
    }
}
