package com.example.myapplication.lesson_14;

public class PotokOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
