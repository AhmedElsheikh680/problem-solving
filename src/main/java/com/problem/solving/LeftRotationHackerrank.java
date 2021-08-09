package com.problem.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotationHackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int round = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        List l = new ArrayList();
        for (int i = round; i < size; i++) {
            l.add(arr[i]);
        }
        for (int i = 0; i < round; i++) {
            l.add(arr[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(l.get(i) + " ");
        }

    }

}
