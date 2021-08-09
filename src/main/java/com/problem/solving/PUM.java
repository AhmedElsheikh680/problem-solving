package com.problem.solving;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= num; i++) {
            if (counter % 4 == 0) {
                System.out.println(" PUM");
                counter++;
                i--;
            } else {
                System.out.print(counter++ + " " + counter++ + " " + counter++);
            }
        }
        System.out.println(" PUM");
    }
}
