package com.problem.solving;

import java.util.Scanner;

public class mahmoudAndLongestUncommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value1 = sc.next();
        String value2 = sc.next();
        if (value1.equals(value2)) {
            System.out.println(-1);
        } else if (value1.length() > value2.length()) {
            System.out.println(value1.length());
        } else {
            System.out.println(value2.length());
        }
    }
}
