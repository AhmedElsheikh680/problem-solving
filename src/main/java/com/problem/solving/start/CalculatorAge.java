package com.problem.solving.start;

import java.util.Scanner;

public class CalculatorAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/365+ " years");
        n = n % 365;
        System.out.println(n/30+ " months");
        n =n % 30;
        System.out.println(n + " days");

    }
}
