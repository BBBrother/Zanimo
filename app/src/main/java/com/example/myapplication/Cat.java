package com.example.myapplication;

public class Cat extends Animal{
    public Cat(String food, String location) {
        super("korm", "dom");
    }


    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
