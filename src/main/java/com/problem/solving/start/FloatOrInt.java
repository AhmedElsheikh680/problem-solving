package com.problem.solving.start;

import java.util.Scanner;

public class FloatOrInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int x = (int) num;
        if(num -x > 0){
            System.out.println("float " + x + " " + (num-x));
        } else {
            System.out.println("int "+ x);
        }
    }
}
