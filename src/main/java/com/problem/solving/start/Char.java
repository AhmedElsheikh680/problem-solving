package com.problem.solving.start;

import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        if(x >=97 && x <= 122) {
            int s =x-32;
            System.out.println((char)s);
        } else if(x >=65 && x<=90) {
            int y = x +32;
            System.out.println((char)y);
        }
    }
}
