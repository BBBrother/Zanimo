package com.example.myapplication.lesson_15;

import java.util.Scanner;

public class BusStop {
    Scanner in = new Scanner(System.in);
    private int product=0;
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        int rrr =(int) (Math.random()*10);
        product -= rrr;
        System.out.println("Сел "+rrr+" человек");
        System.out.println("Осталось "+product);
        notify();
    }
    public synchronized void put() {
        while (product>=1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        System.out.println("Сколько мест в маршрутке");
        product = in.nextInt();
        notify();
    }
}

