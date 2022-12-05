package com.example.myapplication.lesson_9;

public class Practice {
    public static void main(String[] args) {
        String[] array = new String[4];
        try {
            System.out.println(array[7]);
        } catch (StackOverflowError e) {
            System.out.println("file ne naiden");
        } catch (IndexOutOfBoundsException x) {
            System.out.println("index bolshoi");
        }
        finally {
            System.out.println("vsio horosho");
        }
    }
}
