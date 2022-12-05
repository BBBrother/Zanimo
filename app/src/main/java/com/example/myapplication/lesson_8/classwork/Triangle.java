package com.example.myapplication.lesson_8.classwork;

public class Triangle extends Figure{
    public Triangle(int side) {
        super(side);
    }

    @Override
    public int getSquare() {
        double sqrTriangle = (Math.pow(getSide(),2.0)*Math.sqrt(3))/4;
        return (int) sqrTriangle;
    }
}
