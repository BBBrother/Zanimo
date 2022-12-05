package com.example.myapplication.old_lesson;

public class LesSeven {
    public static void main(String[] args){
        Animal[] animals=new Animal[6];
                animals[0]= new Cat("","");
                animals[1]= new Dog("","");
                animals[2]= new Duck("","");
                animals[3]= new Duck("","");
                animals[4]= new Dog("","");
                animals[5]= new Cat("","");
        for (int i = 0 ; i < animals.length ; i++) {
            animals[i].sound();
        }
    }
}
