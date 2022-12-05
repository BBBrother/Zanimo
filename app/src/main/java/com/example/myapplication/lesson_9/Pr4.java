package com.example.myapplication.lesson_9;

public class Pr4 {
    public static void oshibka() throws NullPointerException {
        throw new NullPointerException("demo");
        }


    public static void main(String[] args) {
        oshibka();
        System.out.println("vso ok");
    }
}
