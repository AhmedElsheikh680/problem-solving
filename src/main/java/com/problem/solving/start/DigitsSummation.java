package com.problem.solving.start;

import java.util.Scanner;

public class DigitsSummation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        System.out.println((X % 10) + (Y%10));

    }
}
