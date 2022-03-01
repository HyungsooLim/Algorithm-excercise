package com.baekjoon.q2588;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = 1;
        int count = 0;
        ArrayList<Integer> ar_a = new ArrayList<>();
        ArrayList<Integer> ar_b = new ArrayList<>();
        while (a > 0 || b > 0) {
            int remainder_a = a % 10;
            int remainder_b = b % 10;
            ar_a.add(remainder_a * multiply);
            ar_b.add(remainder_b * multiply);
            a = a / 10;
            b = b / 10;
            multiply = multiply * 10;
            count++;
            if (a < 1 && b < 1) {
                break;
            }
        }
        int[] lines = new int[count];
        multiply = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(ar_b.get(i) * (ar_a.get(0) + ar_a.get(1) + ar_a.get(2)) / multiply);
            lines[i] = ar_b.get(i) * (ar_a.get(0) + ar_a.get(1) + ar_a.get(2));
            multiply = multiply*10;
        }
        System.out.println(lines[0]+lines[1]+lines[2]);
    }
}
