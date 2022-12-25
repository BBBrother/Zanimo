package com.example.myapplication.lesson_14;

public class Pr3Main {
    public static void main(String[] args) {
        Pr3 potok = new Pr3();

        Thread potok1 = new Thread(potok);
        Thread potok2 = new Thread(potok);
        Thread potok3 = new Thread(potok);

        potok1.start();
        potok2.start();
        potok3.start();
    }
}
