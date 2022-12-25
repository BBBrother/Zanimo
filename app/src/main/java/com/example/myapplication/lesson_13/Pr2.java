package com.example.myapplication.lesson_13;

import java.util.Optional;
import java.util.Scanner;

public class Pr2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Optional<Integer> number = Optional.ofNullable(enterNumber());
        if (number.isPresent()) {
            System.out.println(number.get());
        } else {
            System.out.println("Некоректный ввод");
        }
    }

    public static Integer enterNumber() {
        try {
            System.out.println("Введите число");
            return in.nextInt();
        } catch (Exception exception) {
            return null;
        }
    }
}


