package com.baekjoon.q10828;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10828<T> {
    private final List<Integer> stack = new ArrayList<Integer>();
    public void push(int x) {
        stack.add(x);
    }

    public Integer pop(){
        if(stack.isEmpty()){
            return null;
        }
        return stack.remove(this.size()-1);
    }

    public Integer size(){
        return stack.size();
    }

    public Integer empty() {
        if(this.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void top() {

    }


    public static void main(String[] args) {
        Main10828<Integer> list = new Main10828<Integer>();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            String input = sc.nextLine();
            if(input.contains("push")){
                String[] arr = input.split(" ");
                list.push(Integer.parseInt(arr[1]));
            }
        }
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.pop());
        }
    }
}
