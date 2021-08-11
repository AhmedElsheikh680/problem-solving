package com.problem.solving.start;

import java.util.Scanner;

public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        long y = sc.nextLong();
        char c = sc.next().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
    }
}
