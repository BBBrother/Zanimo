package com.example.myapplication.lesson_14;

public class Chitnie extends Thread{
    @Override
    public void run () {
        for (int i = 0; i <100 ; i++){
            if (i % 2 == 0){
                System.out.println("чёт "+i);
            }
        }
    }
}
