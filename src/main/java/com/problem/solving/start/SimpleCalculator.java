package com.problem.solving.start;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  X= sc.nextInt();
        long Y = sc.nextInt();
        System.out.println(X + " + "+ Y + " = " + (X+Y));
        System.out.println(X + " * " + Y+ " = " + (X*Y));
        System.out.println(X + " - " + Y+ " = "+ (X-Y));
    }
}
