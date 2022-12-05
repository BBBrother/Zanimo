package com.example.myapplication.old_lesson;

import com.example.myapplication.old_lesson.Animal;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void sound(){
        System.out.println("Wow");
    }
}
