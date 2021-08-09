package com.problem.solving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new HashSet<Integer>(); // 4 4 2 3
        // 4 2 3
        for (int i = 0; i < 4; i++) {
            nums.add(sc.nextInt());
        }
        System.out.println(4 - nums.size());

    }
}
