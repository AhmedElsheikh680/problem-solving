package com.problem.solving.start;

import java.util.Scanner;

public class CapitalOrSmallOrDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c >= 97 && c <= 122) {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        } else if(c >= 65 && c <=90){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        } else {
            System.out.println("IS DIGIT");
        }
    }
}
