package com.problem.solving;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String value = sc.next();
        char[] values = value.toCharArray();
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (i != num - 1 && values[i] == values[i + 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
