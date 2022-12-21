package com.example.myapplication.lesson_15;

import java.util.Scanner;

public class Bus implements Runnable {
    Scanner in = new Scanner(System.in);
    BusStop store;
    int busSize;

    Bus(BusStop store) {
        this.store = store;
//        this.busSize = setBusSize();
    }

    public void run() {
        while (true){
            store.get();
        }
    }

    public int getBusSize() {
        return busSize;
    }

//    public int setBusSize() {
//        return busSize = in.nextInt();
//    }
}

