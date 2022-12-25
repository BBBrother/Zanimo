package com.example.myapplication.lesson_14;

public class Pr1 {
    public static void main(String[] args) {
       Chitnie chitnie = new Chitnie();
       Nechitnie nechitnie = new Nechitnie();
       Thread gh = new Thread(nechitnie);

       chitnie.start();
       gh.start();
    }
}
