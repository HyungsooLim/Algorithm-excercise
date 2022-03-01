package com.baekjoon.q10818;

import java.util.Scanner;

public class Main10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String inputs = sc.nextLine();
        String[] ars = inputs.split(" ");
        int[] ar = new int[count];
        for (int i = 0; i < count; i++) {
            ar[i] = Integer.parseInt(ars[i]);
        }
        int min = ar[0];
        int max = ar[0];
        for (int i = 0; i < count; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
