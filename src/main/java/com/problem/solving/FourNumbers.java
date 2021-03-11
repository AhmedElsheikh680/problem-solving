package com.problem.solving;

import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long result = a * b * c * d;
        System.out.println(result);
    }
}
