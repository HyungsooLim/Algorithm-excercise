package com.baekjoon.q2884;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] parser = time.split(" ");
        int hour = Integer.parseInt(parser[0]);
        int minute = Integer.parseInt(parser[1]);
        minute = minute - 45;
        if (minute < 0) {
            hour = hour - 1;
            minute = 60 + minute;
            if (hour < 0) {
                hour = 24 + hour;
            }
        }
        System.out.println(hour+" "+minute);
    }
}
