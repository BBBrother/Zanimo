package com.example.myapplication.lesson_14;

public class Pr2 {
    public static void main(String[] args) throws InterruptedException {
        PotokOne potokOne = new PotokOne();
        PotokTwo potokTwoShadow = new PotokTwo();
        Thread potokTwo = new Thread(potokTwoShadow);
        Runnable potokThreeShadow = () -> {
            for (int i = 21; i <= 30; i++) {
                System.out.println(i);
            }
        };
        Thread potokThree = new Thread(potokThreeShadow);

        potokOne.start();
        try {
            potokOne.join();
        } catch (Exception e) {
           e.printStackTrace();
        }
        potokTwo.start();
        try {
            potokTwo.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        potokThree.start();
    }
}
