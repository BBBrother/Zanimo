package com.example.myapplication.lesson_14;

public class Nechitnie implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++){
            if (i % 2 == 1){
                System.out.println("нечёт "+i);
            }
        }
    }
}
