package com.problem.solving;

import java.util.Scanner;

public class PetyaAndJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            long num = sc.nextLong();
            if(num <= 127){
                System.out.println("byte");
            }else if (num <= 32767){
                System.out.println("short");
            }else if(num <= 2147483647){
                System.out.println("int");
            }else  {
                System.out.println("long");
            }
        }catch(Exception e){
            System.out.println("BigInteger");
        }

    }
}
