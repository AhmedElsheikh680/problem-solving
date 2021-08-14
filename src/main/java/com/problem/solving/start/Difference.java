package com.problem.solving.start;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long D = sc.nextInt();
        System.out.println("Difference = "+( (A * B)  -  (C * D)));
    }
}
