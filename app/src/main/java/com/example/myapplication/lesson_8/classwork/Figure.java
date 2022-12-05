package com.example.myapplication.lesson_8.classwork;

abstract class Figure implements Squqareble {
    private int side;

    public Figure(int side){
        this.side=side;
    }

    public int getSide() {
        return side;
    }
}
