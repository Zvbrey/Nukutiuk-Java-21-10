package com.hillel.nukutiuk.homeworks.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int M = 0, N = 0;

        System.out.println("Enter the number of rows and columns for the array");


        for (int i = 0; i < 2; ) {
            if (scn.hasNextInt()) {
                i++;
                M = scn.nextInt();
                if (scn.hasNextInt()) {
                    N = scn.nextInt();
                    i++;
                    if (M < 1 || N < 1) {
                        System.out.println("Wrong data, try again!");
                        i -= 2;
                    }

                } else {
                    System.out.println("Wrong data, try again!");
                    scn.next();
                }

            } else {
                System.out.println("Wrong data, try again!");
                scn.next();
            }
        }

        int[][] array = new int[M][N];
        int[][] array2 = new int[N][M];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }

        for (int[] value : array) {
            for (int i : value) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
