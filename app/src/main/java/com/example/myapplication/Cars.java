package com.example.myapplication;

public class Cars {
    String marka;

    public void nameCars() {
        System.out.println("I'm machine "+marka);
    }

    public Cars(String marka){
        this.marka=marka;
    }
}
