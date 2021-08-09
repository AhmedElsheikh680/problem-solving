package com.problem.solving.revision;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size: ");
    int size = sc.nextInt();
    String [] names =  new String [size];
    int [] degrees = new int [size];

    for(int i=0; i<size; i++){
        System.out.println("Enter Student Name: ");
        sc.nextLine();
        names[i] = sc.nextLine();
        System.out.println("Enter Student Degree: ");
        degrees[i] = sc.nextInt();
    }
    int max = degrees[0];
    int min = degrees[0];
    String max_student = names[0];
    String min_student = names[0];
    for(int i=0; i< size; i++){
        if(degrees[i] > max) {
            max = degrees[i];
            max_student =  names[i];
        }else if(degrees[i] < min){
            min = degrees[i];
            min_student = names[i];
        }
    }
        System.out.println("Max Student Degree Is: " + max + " And Name Is " + max_student);
        System.out.println("Min Student Degress Is: " + min + " And Name Is " + min_student);


    }
}
