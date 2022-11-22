package com.example.myapplication;

public class Person {
    String name;
    int age;
    Car car;
    public Person(String name,int age,Car car){
        this.name=name;
        this.age=age;
        this.car=car;
    }
    public void nameYourCar(){
        System.out.println("My car is "+car.getModel());
    }

    public void sayYourName(){
        System.out.println("My name is "+name);
    }
    public int getYourAge(){
        return age;
    }

}

