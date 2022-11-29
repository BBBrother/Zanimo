package com.example.myapplication.lesson_8.classwork;

public class Practice {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.print();

        Walkable someObj=new Walkable() {
            @Override
            public void walk() {
                System.out.println("fusdiu");
            }
        };

        Figure triangle = new Triangle(10);
        System.out.println(triangle.getSquare());

        Figure circe = new Circle(5);
        System.out.println(circe.getSquare());

        Figure rectangle = new Rectangle(5,4);
        System.out.println(rectangle.getSquare());

    }
}
