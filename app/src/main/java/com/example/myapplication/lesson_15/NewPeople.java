package com.example.myapplication.lesson_15;

public class NewPeople implements Runnable {
    BusStop ochered;

    NewPeople(BusStop ochered) {
        this.ochered = ochered;
    }

    public void run() {
        while (true) {
            ochered.put();
        }
    }

//    public int ochered(){
//        return ochered = (int) (Math.random()*10);
//    }
}

