package com.hillel.nukutiuk.homeworks.test;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        boolean flagForFirstNumb = true;
        boolean isReady = false;
        int firstNunb = 0;
        int secondNumb = 0;

        while (!isReady) {

            if (!scn.hasNextInt()) {
                System.out.println("wrong data");
                continue;
            }

            if (flagForFirstNumb) {
                firstNunb = scn.nextInt();
                flagForFirstNumb = false;
            } else {
                secondNumb = scn.nextInt();
                flagForFirstNumb = true;
            }
        }
        System.out.println(firstNunb);
        System.out.println(secondNumb);
    }


}