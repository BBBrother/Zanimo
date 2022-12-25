package com.example.myapplication.lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pr3 {
    public static void main(String[] args) {
        List<String> employersList = new ArrayList<>();
        employersList.add("nadyentd");
        employersList.add("masbrdfs");
        employersList.add("yhjhkjhf");
        employersList.add("autikyujythg");
        employersList.add("mwerttyuyik");

        for (String f:
             employersList) {
            System.out.println(f);
        }

        List<String> list = employersList.stream()
                .filter(name -> name.startsWith("m"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
