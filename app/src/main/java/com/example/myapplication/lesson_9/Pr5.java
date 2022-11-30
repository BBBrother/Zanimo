package com.example.myapplication.lesson_9;

import java.util.Scanner;

public class Pr5 {
    String login;
    String password;
    String confirmPassword;

    public static void metod (String login, String password, String confirmPassword){
        Scanner in = new Scanner(System.in);
        login=in.next();
        password=in.next();
        confirmPassword=in.next();
        if(login.matches("[A-Za-z\\d_]{1,20}")){
        }
    }
}
