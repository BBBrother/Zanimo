package com.example.myapplication.lesson_15;

public class Program {
    public static void main(String[] args) {
        BusStop store = new BusStop();
        NewPeople producer = new NewPeople(store);
        Bus consumer = new Bus(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

