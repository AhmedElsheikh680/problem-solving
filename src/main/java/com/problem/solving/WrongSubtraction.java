package com.problem.solving;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int operation = sc.nextInt();
        for (int i = 0; i < operation; i++) {
            if (number % 10 == 0) {
                number /= 10;
                continue;
            }
            number--;
        }
        System.out.println(number);
    }
}
