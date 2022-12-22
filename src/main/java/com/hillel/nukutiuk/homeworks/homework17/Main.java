package com.hillel.nukutiuk.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(DrinksMachine.COFFEE);
        System.out.println(DrinksMachine.COFFEE.getDrink());
        System.out.println(Arrays.toString(DrinksMachine.values()));
        for (DrinksMachine value : DrinksMachine.values()){
            System.out.println(value.getDrink());
        }
//        System.out.println(DrinksMachine.valueOf("ЧАЙ"));
        Scanner scn = new Scanner(System.in);

        System.out.println("Please select a drink from the menu: " );

    }

}
