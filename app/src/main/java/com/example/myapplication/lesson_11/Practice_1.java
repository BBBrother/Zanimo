package com.example.myapplication.lesson_11;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Practice_1 {
    public static void main(String[] args) {
        Student ivan = new Student("ivan", 10d, 5, 1);
        Student ivan2 = new Student("ivan2", 12d, 1, 2);
        Student ivan3 = new Student("ivan3", 15d, 6, 4);
        Student ivan4 = new Student("ivan4", 16d, 3, 99);

        ArrayList<Student> yniver = new ArrayList<Student>();
        yniver.add(ivan);
        yniver.add(ivan2);
        yniver.add(ivan3);
        yniver.add(ivan4);
        for (Student student : yniver) {
            student.upKyrs();
        }

        ArrayDeque<HeavyBox> lift = new ArrayDeque<>();
        HeavyBox box = new HeavyBox();
        int i = 0;
        while (i < 5) {
            lift.offer(box);
            i++;
            System.out.println(i);
        }
        lift.poll();


    }
}
