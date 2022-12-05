package com.example.myapplication.old_lesson;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Введите индекс");
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        if (z< array.length&&z>0) {
            int y = array[z];
            System.out.println(y);
        } else {
            System.out.println("Введён слишком большой индекс");
        }
    }
}
