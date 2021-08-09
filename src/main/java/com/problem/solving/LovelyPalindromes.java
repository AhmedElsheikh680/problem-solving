package com.problem.solving;

import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        char[] nums = value.toCharArray();
        System.out.print(value);
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}
