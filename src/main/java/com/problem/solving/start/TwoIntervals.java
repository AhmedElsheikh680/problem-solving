package com.problem.solving.start;

import java.util.Scanner;

public class TwoIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        if(l2 >= l1 && l2 <= r1){
            if(r2 >= r1) {
                System.out.println(l2 + " " + r1);
            } else if(r1 >= r2){
                System.out.println(l2 + " " + r2);
            }
        }

        else if(l1>= l2 && l1 <=r2) {
            if(r1 >=r2) {
                System.out.println(l1 + " " + r2);
            } else if(r2 >=r1){
                System.out.println(l1 + " " + r1);
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
