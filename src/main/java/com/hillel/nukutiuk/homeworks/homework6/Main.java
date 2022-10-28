package com.hillel.nukutiuk.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the name of the first team");
        String redTeam = scn.nextLine();

        System.out.println("Please enter the number of frags as the first player");
        int firstRed = 0;
        if (scn.hasNextInt()) {
            firstRed = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the second player");
        int secondRed = 0;
        if (scn.hasNextInt()) {
            secondRed = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the third player");
        int thirdRed = 0;
        if (scn.hasNextInt()) {
            thirdRed = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the fourth player");
        int fourthRed = 0;
        if (scn.hasNextInt()) {
            fourthRed = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the fifth player");
        int fifthRed = 0;
        if (scn.hasNextInt()) {
            fifthRed = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }

        scn.nextLine();

        System.out.println("Please enter the name of the second team");
        String blueTeam = scn.nextLine();

        System.out.println("Please enter the number of frags as the first player");
        int firstBlue = 0;
        if (scn.hasNextInt()) {
            firstBlue = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the second player");
        int secondBlue = 0;
        if (scn.hasNextInt()) {
            secondBlue = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the third player");
        int thirdBlue = 0;
        if (scn.hasNextInt()) {
            thirdBlue = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the fourth player");
        int fourthBlue = 0;
        if (scn.hasNextInt()) {
            fourthBlue = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }
        System.out.println("Please enter the number of frags as the fifth player");
        int fifthBlue = 0;
        if (scn.hasNextInt()) {
            fifthBlue = scn.nextInt();

        } else {
            System.out.println("Wrong data! Please, restart application");
            System.exit(0);
        }

        double redResult = (firstRed + secondRed + thirdRed + fourthRed + fifthRed) / 5.0;
        double blueResult = (firstBlue + secondBlue + thirdBlue + fourthBlue + fifthBlue) / 5.0;

        if (redResult > blueResult) {
            System.out.println("Перемогла команда " + redTeam + " набрала " + redResult + " очків.");
        } else if (redResult < blueResult) {
            System.out.println("Перемогла команда " + blueTeam + " набрала " + blueResult + " очків.");
        } else {
            System.out.println("Пеможця немає, нічія з рахунком: " + blueResult + " очків.");
        }

    }
}