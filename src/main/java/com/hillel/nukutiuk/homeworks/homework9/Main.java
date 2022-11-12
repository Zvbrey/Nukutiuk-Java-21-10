package com.hillel.nukutiuk.homeworks.homework9;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = random.nextInt(23) + 18;
        }

        for (int i = 0; i < team2.length; i++) {
            team2[i] = random.nextInt(23) + 18;
        }

        int sumTeam1 = 0, sumTeam2 = 0;

        for (int i : team1) {
            sumTeam1 += i;
        }

        for (int i : team2) {
            sumTeam2 += i;
        }

        double avgTeam1 = (double) sumTeam1 / team1.length;
        double avgTeam2 = (double) sumTeam2 / team2.length;

        System.out.println("The average age of the team" + Arrays.toString(team1)
                .replace("[", "").replace("]", ""));
        System.out.println("The average age of the team" + Arrays.toString(team2)
                .replace("[", "").replace("]", ""));
        System.out.println(avgTeam1);
        System.out.println(avgTeam2);

    }
}

