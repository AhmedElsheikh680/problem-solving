package com.problem.solving;

import java.util.Scanner;

public class ColorfulStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stones = sc.next();
        String instructions = sc.next();
        int counter = 1;
        int index=0;
        for(int i=0; i<instructions.length(); i++){
            if(stones.toCharArray()[index] ==  instructions.toCharArray()[i]){
                counter++;
                index++;
            }
        }
        System.out.println(counter);
    }
}
