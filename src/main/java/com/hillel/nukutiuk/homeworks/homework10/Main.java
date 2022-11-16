package com.hillel.nukutiuk.homeworks.homework10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] lottery = new int[7];
        int[] player = new int[7];
        ArrayList<String> matches = new ArrayList<>();

        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = (int) (Math.random() * 8);
        }

        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 8);
        }

        Arrays.sort(lottery);
        Arrays.sort(player);

        int counter = 0;

        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == player[i]) {
                matches.add(String.valueOf(i));
                counter++;
            }
        }

        System.out.println("Кількість збігів: " + counter);

        if (counter == 1) {
            System.out.print("Збіги в інденсі ");
            for (String i : matches) {
                System.out.print(i + " ");
            }

        } else if (counter > 1) {
            System.out.print("Збіги в інденсах ");
            for (String i : matches) {
                System.out.print(i + " ");
            }
        }
    }
}