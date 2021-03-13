package com.problem.solving;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int sum=0;
        for(int i=0; i<=num; i++){
            //One Digit
            if(i /10 == 0){
                if(i >= val1 && i<= val2){
                    sum+=i;
                }
            }else {
                // Two Digit
                int number = i;
                int mySum=0;
                while(number !=0){
                    int myNum = number%10;
                    mySum +=myNum;
                    number /=10;
                }
                if(mySum >=val1 && mySum <=val2){
                    sum +=i;
                }

            }
        }
        System.out.println(sum);
    }
}
