package com.example.myapplication;

public class Dog extends Animal{
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void sound(){
        System.out.println("Wow");
    }
}
