package com.problem.solving.testing;

import java.util.Scanner;

public class TheLastTwoDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        a %=100;
        b %=100;
        c %=100;
        d %=100;

        long multi = a * b * c * d;
        int x = (int) (multi %100);
        if(x < 10) { // One digit
            System.out.println( "0"+x);
        } else {
            System.out.println(x);
        }

    }
}
