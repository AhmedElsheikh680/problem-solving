package com.problem.solving.start;

import java.util.Scanner;

public class Summationfrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n *(n+1) / 2);
    }
}

/*
    Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long sum =0;
        for(int i=1; i<=x; i++){
            sum+= i;
        }
        System.out.println(sum);
 */