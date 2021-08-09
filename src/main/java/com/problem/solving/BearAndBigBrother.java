package com.problem.solving;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        int counter = 0;
        while (value1 <= value2) {
            value1 *= 3;
            value2 *= 2;
            counter++;
        }
        System.out.println(counter);
    }
}
