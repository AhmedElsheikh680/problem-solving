package com.problem.solving.start;

import java.util.Scanner;

public class CoordinatesOfAPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x >0 && y>0)
            System.out.println("Q1");
        if(x <0 && y> 0)
            System.out.println("Q2");
        if(x <0 && y< 0)
        if(x <0 && y<0)
            System.out.println("Q3");
        if(x >0 && y<0)
            System.out.println("Q4");
        if(x ==0 && y ==0)
            System.out.println("Origem");
        if(x !=0 && y ==0)
            System.out.println("Eixo X");
        if(x ==0 && y!=0)
            System.out.println("Eixo Y");
    }
}
