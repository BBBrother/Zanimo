package com.example.myapplication.old_lesson;

import com.example.myapplication.old_lesson.Animal;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super("korm", "dom");
    }


    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
