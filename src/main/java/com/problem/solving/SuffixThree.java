package com.problem.solving;

import java.util.Scanner;

public class SuffixThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String value = sc.next();
            int length = value.toCharArray().length;
            if (length >= 4) {
                if (value.substring(length - 2).equals("po")) {
                    System.out.println("FILIPINO");
                } else if (value.substring(length - 4).equals("desu") || value.substring(length - 4).equals("masu")) {
                    System.out.println("JAPANESE");
                } else if (value.substring(length - 5).equals("mnida")) {
                    System.out.println("KOREAN");
                }
            } else {
                System.out.println("FILIPINO");
            }
        }
    }
}
