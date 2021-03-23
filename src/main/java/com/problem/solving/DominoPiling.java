package com.problem.solving;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long result  = num1 * num2;
        System.out.println(result /2);
    }
}
