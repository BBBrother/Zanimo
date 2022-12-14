package com.example.myapplication.lesson_11;

import java.util.ArrayDeque;

public class Student {
    String name;
    double group;
    int sredyiBal;
    int kyrs;

    public Student (String name, double group, int sredyiBal, int kyrs) {
        this.name=name;
        this.group=group;
        this.sredyiBal=sredyiBal;
        this.kyrs=kyrs;
    }

    public void upKyrs(){
        if (sredyiBal>=3){
            kyrs++;
            System.out.println(name+" pereveden na "+kyrs+" kyrs");
        }else {
            System.out.println(name+" otchislen c "+kyrs+" kyrs");
        }
    }
}
