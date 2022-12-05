package com.example.myapplication.lesson_8.classwork;

public class Circle extends Figure{
    public Circle(int side) {
        super(side);
    }

    @Override
    public int getSquare() {
        double sqrCircle = Math.PI*Math.pow(getSide(),2);
        return (int) sqrCircle;
    }
}
