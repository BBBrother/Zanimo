package com.example.myapplication;

public class Duck extends Animal{
    public Duck(String food, String location) {
        super(food, location);
    }

    @Override
    public void sound(){
        System.out.println("Quack");
    }
}
