package com.problem.solving;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            for (int z = min + 1; z < max; z++) {
                if (z % 2 != 0) {
                    sum += z;
                }
            }
            System.out.println(sum);
        }

    }
}
