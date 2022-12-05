package com.example.myapplication.old_lesson;

import com.example.myapplication.old_lesson.Animal;

public class Duck extends Animal {
    public Duck(String food, String location) {
        super(food, location);
    }

    @Override
    public void sound(){
        System.out.println("Quack");
    }
}
