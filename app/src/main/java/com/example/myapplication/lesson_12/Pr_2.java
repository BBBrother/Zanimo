package com.example.myapplication.lesson_12;

import java.util.HashSet;
import java.util.Scanner;

public class Pr_2 {
    static HashSet<Integer> kycha = new HashSet<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            Integer number = in.nextInt();
            kycha.add(number);
            System.out.println(kycha);
        }
    }
}
