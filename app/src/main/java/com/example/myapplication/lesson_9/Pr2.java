package com.example.myapplication.lesson_9;

import java.io.FileReader;
import java.io.IOException;

public class Pr2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\Lena\\Desktop\\try.txt")) {
            char[] array = new char[26];
            fr.read(array);
            for (char c : array){
            System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
