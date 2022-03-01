package com.baekjoon.q2562;

import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[9];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int a = ar[0];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (a < ar[i]) {
                a = ar[i];
                count = i;
            }
        }
        System.out.println(a);
        System.out.println(count+1);
    }
}
