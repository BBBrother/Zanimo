package com.example.myapplication.lesson_8.classwork;

public class Rectangle extends Triangle {
    public int anotherSide;
    public Rectangle(int side,int anotherSide) {
        super(side);
        this.anotherSide = anotherSide;
    }

    @Override
    public int getSquare() {
        double sqrSquare = getSide()*anotherSide;
        return (int) sqrSquare;
    }
}
