package com.hillel.nukutiuk.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 3;
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("You have been guessed a number from 0 to 10. You have 3 attempts to guess them. Good luck");

        while (i >= 1) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == randomNumber) {
                    System.out.println("You win");
                    break;

                } else {
                    System.out.println("No, this is not the number that was guessed. Try again.");
                    i--;
                }

            } else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }

        }


    }
}