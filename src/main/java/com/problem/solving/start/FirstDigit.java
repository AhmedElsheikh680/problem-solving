package com.problem.solving.start;

import java.util.Scanner;

public class FirstDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int s =  (x/1000);
        if(s %2 == 0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
}
