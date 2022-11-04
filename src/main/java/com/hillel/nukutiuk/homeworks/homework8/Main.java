package com.hillel.nukutiuk.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 153; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 - 10 == 4) {
                continue;
            }
            System.out.println("Shuttle number: " + i);
        }


    }
}
