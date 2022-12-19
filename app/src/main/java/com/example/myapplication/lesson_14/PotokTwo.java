package com.example.myapplication.lesson_14;

public class PotokTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
