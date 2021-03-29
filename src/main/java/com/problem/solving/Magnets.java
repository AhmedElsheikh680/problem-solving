package com.problem.solving;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMg = sc.nextInt();
        int oldMg=0;
        int counter=0;
        for (int i=0; i<numMg; i++){
            int newMg = sc.nextInt();
            if(newMg  != oldMg){
                counter++;
            }
            oldMg = newMg;
        }
        System.out.println(counter);
    }
}
