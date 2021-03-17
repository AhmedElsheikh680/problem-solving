package com.problem.solving;

import java.util.Scanner;

public class SearchProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean flag  = false;
        for(int i=0; i<size;i++){
            int answer = sc.nextInt();
            if(answer == 1){
                flag =true;
                break;
            }
        }
        if(flag){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}
