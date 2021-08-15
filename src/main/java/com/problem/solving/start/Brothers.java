package com.problem.solving.start;

import java.util.Scanner;

public class Brothers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();

        String firstName2 = sc.next();
        String secondName2 = sc.next();
        if (secondName.equals(secondName2)) {
            System.out.println("ARE Brothers");

        } else {
            System.out.println("NOT");
        }

    }
}
