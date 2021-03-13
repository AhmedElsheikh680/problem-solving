package com.problem.solving;

import java.util.Scanner;

public class  NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 97; //a
        int moves =0;
        String value = sc.next(); //cbc
        for(int i=0; i<value.length(); i++){
            int result = Math.abs(value.toCharArray()[i] -start);
            if(result <= 13){
                moves +=result;
            }else {
                moves +=(26-result);
            }
            start = value.toCharArray()[i]; // c
        }
        System.out.println(moves);
    }
}
