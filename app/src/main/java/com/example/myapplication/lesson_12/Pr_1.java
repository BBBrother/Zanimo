package com.example.myapplication.lesson_12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Pr_1 {
    static HashMap<String,Product> toys = new HashMap<>();

    public static void main(String[] args) {
        Product carPrice = new Product(32);
        toys.put("car",carPrice);
        Product bearPrice = new Product(43);
        toys.put("bear",bearPrice);
        Product pistolPrice = new Product(54);
        toys.put("pistol",pistolPrice);

        pervoe();
        vtoroe();
        tretee();
    }

    static void pervoe(){
        for (Map.Entry<String,Product> morj: toys.entrySet()){
            Product morjValue = morj.getValue();
            int price = morjValue.price;
            System.out.println(morj.getKey()+" "+price);
        }
    }

    static void vtoroe(){
        System.out.println(toys.keySet());
    }

    static void tretee(){
        Collection<Product> top= toys.values();
        for (Product morj: top){
            System.out.println(morj.price);
        }
    }
}
