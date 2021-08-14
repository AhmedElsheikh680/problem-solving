package com.problem.solving.start;

import java.util.Scanner;

public class TwNoumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double result = num1 / num2;
        System.out.println("floor "+ (int)num1 + " / "+(int)num2 + " = "+ (int)Math.floor(result));
        System.out.println("ceil " + (int)num1 + " / "+ (int)num2 + " = "+ (int)Math.ceil(result));
        System.out.println("round "+ (int)num1 + " / "+ (int)num2 + " = " + (int)Math.round(result));
    }
}
