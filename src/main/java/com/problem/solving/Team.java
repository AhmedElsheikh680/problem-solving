package com.problem.solving;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numQuestion = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < numQuestion; i++) {
            int total = 0;
            for (int x = 0; x < 3; x++) {
                int answer = sc.nextInt();
                total += answer;
            }
            if (total >= 2) {
                counter++;

            }
        }
        System.out.println(counter);
    }
}
