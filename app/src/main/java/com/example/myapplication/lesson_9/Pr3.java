package com.example.myapplication.lesson_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner in = new Scanner(System.in);
        System.out.println("vvedite index");
        int chislo = in.nextInt();
        try {
            System.out.println(array[chislo]);
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("bolshoi index");
        } catch (InputMismatchException ime) {
            System.out.println("nado vvodit cifri a ne bukvi");
        } finally {
            System.out.println("programma zvershena");
        }
    }
}
