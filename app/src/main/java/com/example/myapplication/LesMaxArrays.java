package com.example.myapplication;

import java.util.Arrays;
import java.util.Scanner;

public class LesMaxArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер трёх массивов");
        int arrayLengthOne = in.nextInt();
        int arrayLengthTwo = in.nextInt();
        int arrayLengthThree = in.nextInt();
        int[][][] arrayTrehmernyi = new int[arrayLengthOne][arrayLengthTwo][arrayLengthThree];
        for (int[][] startOne : arrayTrehmernyi) {
            for (int[] startTwo : startOne) {
                for (int startThree = 0; startThree < startTwo.length; startThree++) {
                    startTwo[startThree] = (int) (Math.random() * 100);
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayTrehmernyi));



        String[][] shahmati = new String[8][8];
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if (i+j%2==0){
                    shahmati[i][j]="w";
                }else if(i+j%2==1) {
                    shahmati[i][j]="b";
                }
            }
            System.out.println(Arrays.deepToString(shahmati[i]));
        }
    }
}

