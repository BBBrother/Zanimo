package com.example.myapplication.lesson_13;

import java.util.Optional;

public class Pr_1 {
    public static void main(String[] args) {
        String s = null;

        Optional<String> opt = Optional.ofNullable(s);
        boolean optNotNull = opt.isPresent();
        System.out.println("s is null? "+optNotNull);
    }
}
