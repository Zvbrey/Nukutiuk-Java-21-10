package com.hillel.nukutiuk.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        int trueConter = 1;
        int numberOfShatle = 100;

        while (true) {
            if (number / 10 == 4 || number / 10 == 9 || number % 10 == 4 || number % 10 == 9 || number / 10 == 14) {
                number++;
                continue;

            } else if (trueConter == numberOfShatle){
                break;

            }else {
                System.out.println("Shuttle number: " + number);
                number++;
                trueConter++;
            }

        }


    }
}