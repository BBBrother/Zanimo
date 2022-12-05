package com.example.myapplication.lesson_10;

import java.util.Locale;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String alfavit = in.nextLine().trim().toLowerCase(Locale.ROOT);
//        if (!(alfavit.startsWith("abcdefg"))) {
//            System.out.println("nevernie nachalo");
//        } else if (!(alfavit.regionMatches(7, "hijklmnop", 0, 9))) {
//            System.out.println("nevernaya seredina");
//        } else if (!(alfavit.endsWith("qrstuvwxyz"))) {
//            System.out.println("nevernyi conetc");
//        } else {
//            System.out.println("vsio verno");
//        }
//        StringBuilder sb= new StringBuilder("hello");
//        System.out.println(sb);
//        System.out.println("chatAt(1) = "+sb.charAt(1));
//        sb.setCharAt(1,'i');
//        sb.setLength(2);
//        System.out.println(sb);
//        String s = new String("a");
//        System.out.println(s+"ab");

//          printStringInfo("I Like Java!!!");
          rabocheeNazvanie();
    }
    public static void printStringInfo(String fraza){
        System.out.println("1."+fraza.charAt(fraza.length()-1));
        System.out.println("2."+fraza.endsWith("!!!"));
        System.out.println("3."+fraza.startsWith("I Love"));
        System.out.println("4."+fraza.contains("Java"));
        System.out.println("5."+fraza.indexOf("Java"));
        System.out.println("6."+fraza.replaceAll("a","o"));
        System.out.println("7."+fraza.toUpperCase(Locale.ROOT));
        System.out.println("8."+fraza.toLowerCase(Locale.ROOT));
        System.out.println("9."+fraza.substring(7,11));

    }

    public static void rabocheeNazvanie(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите првое число");
        int x = in.nextInt();
        System.out.println("Ведите второе число");
        int y = in.nextInt();
        StringBuilder xx = new StringBuilder();
        xx.append(x).append(" + ").append(y).append(" = ").append(x+y);
        System.out.println(xx.append(x)+"+"+yy.append(y)+"="+(x+y));
    }
}
