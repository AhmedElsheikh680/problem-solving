package com.problem.solving;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int cha = (int) ch;
        if(ch >= 97){
            System.out.println((char)(cha - 32));
        }else{
            System.out.println((char)(cha + 32));
        }
    }
}
