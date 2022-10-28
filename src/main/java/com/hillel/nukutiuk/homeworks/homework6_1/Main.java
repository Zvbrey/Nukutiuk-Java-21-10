package com.hillel.nukutiuk.homeworks.homework6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the name of the first team");
        String redTeam = scn.nextLine();

        int redCount = 1, blueCount = 1;
        int redSum = 0, blueSum = 0;

        while (redCount <= 5) {
            System.out.println("Please enter the number of frags as the player № " + redCount);

            if (scn.hasNextInt()) {
                redSum += scn.nextInt();
                ++redCount;

            } else {
                System.out.println("Wrong data! Please, restart application");
                System.exit(0);
            }
        }
        scn.nextLine();

        System.out.println("Please enter the name of the second team");
        String blueTeam = scn.nextLine();

        while (blueCount <= 5) {
            System.out.println("Please enter the number of frags as the player № " + blueCount);

            if (scn.hasNextInt()) {
                blueSum += scn.nextInt();
                ++blueCount;

            } else {
                System.out.println("Wrong data! Please, restart application");
                System.exit(0);
            }
        }

        double redResult = redSum / 5.0;
        double blueResult = blueSum / 5.0;

        if (redResult > blueResult) {
            System.out.println("Перемогла команда " + redTeam + " набрала " + redResult + " очків.");
        } else if (redResult < blueResult) {
            System.out.println("Перемогла команда " + blueTeam + " набрала " + blueResult + " очків.");
        } else {
            System.out.println("Пеможця немає, нічія з рахунком: " + blueResult + " очків.");
        }
    }
}
