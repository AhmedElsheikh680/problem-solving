package com.problem.solving;

import java.util.Scanner;

public class TwoIntervals {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        if(r1 < l2){
            System.out.println(-1);
            return;
        }
        if(r1 > l2){
            System.out.println(l2 + " "+ r1);
        }else{
            System.out.println(r1 + " "+ l2);
        }
    }
}
