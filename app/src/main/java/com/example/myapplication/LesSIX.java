package com.example.myapplication;

public class LesSIX {
    public static void main(String[] args){

        Person celovek1= new Person("What?", 20,new Car("Supra"));
        celovek1.sayYourName();
        celovek1.nameYourCar();

        Person celovek2= new Person("Who?", 26,new Car("Subaru"));
        celovek2.sayYourName();
        celovek2.nameYourCar();

        Person celovek3=new Person("Slim Shady",50,new Car("Ford"));
        celovek3.sayYourName();
        System.out.println("возраст "+celovek3.getYourAge());
        celovek3.nameYourCar();
    }
}

