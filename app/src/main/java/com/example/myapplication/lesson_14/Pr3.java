package com.example.myapplication.lesson_14;

public class Pr3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <=100 ;i++){
            if (i % 10 == 0){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception exception){
                    exception.printStackTrace();
                }
            }
        }
    }
}
