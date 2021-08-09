package com.problem.solving;

import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String value = sc.next();
            if (value.toCharArray().length > 10) {
                System.out.println(value.toCharArray()[0] + "" + (value.toCharArray().length - 2) + "" + value.toCharArray()[value.length() - 1]);
                continue;
            }
            System.out.println(value);
        }
    }
}
