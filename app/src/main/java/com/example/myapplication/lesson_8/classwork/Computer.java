package com.example.myapplication.lesson_8.classwork;

public class Computer implements InOutInterface {
    @Override
    public void print() {
        System.out.println("пишу");
    }

    @Override
    public void write() {
        System.out.println("читаю");
    }

    public static void main(String[] args) {


        Computer computer = new Computer();
        computer.write();
        computer.print();
    }

}
