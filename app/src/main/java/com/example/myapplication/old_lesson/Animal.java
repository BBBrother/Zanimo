package com.example.myapplication.old_lesson;

public class Animal {

    private String food;
    private String location;


    public Animal(String food,String location) {
        this.food=food;
        this.location=location;
    }
    public void makeNoise(){
        System.out.println("This animal");

    }

    public void eat(){
        System.out.println("This animal eat "+food);
    }

    public void sleep(){
        System.out.println("This animal sleep");
    }

    public void sound() {
        System.out.println("sound");
    }
}
