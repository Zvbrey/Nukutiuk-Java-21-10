package com.hillel.nukutiuk.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.nukutiuk.homeworks.homework17.DrinksMachine.*;

public class Main {
    public static void main(String[] args) {
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        int totalPrice = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please select a drink from the menu: "
                + Arrays.toString(drinksMachines)
                + " Or enter stop to complete the selection");


        while (true) {
            DrinksMachine drinks = null;
            String userValue = scn.nextLine().toUpperCase();

            if (userValue.equals("STOP")) {
                System.out.println("Total order price " + totalPrice + ". The number of drinks in the order "
                        + Drink.counter);
                break;
            }

            for (DrinksMachine drinksMachine : drinksMachines) {
                if (userValue.equals(drinksMachine.toString())) {
                    drinks = DrinksMachine.valueOf(userValue);
                    break;
                }
            }

            if (drinks != null) {
                new Drink();
                switch (drinks) {
                    case COFFEE -> {
                        totalPrice += Drink.PRICES.get(COFFEE);
                        System.out.println("The " + COFFEE.getDrink() + " is done.");
                        break;
                    }
                    case TEA -> {
                        totalPrice += Drink.PRICES.get(TEA);
                        System.out.println("The " + TEA.getDrink() + " is done.");
                        break;
                    }
                    case LEMONADE -> {
                        totalPrice += Drink.PRICES.get(LEMONADE);
                        System.out.println("The " + DrinksMachine.LEMONADE.getDrink() + " is done.");
                        break;
                    }
                    case MOJITO -> {
                        totalPrice += Drink.PRICES.get(MOJITO);
                        System.out.println("The " + DrinksMachine.MOJITO.getDrink() + " is done.");
                        break;
                    }
                    case COCACOLA -> {
                        totalPrice += Drink.PRICES.get(COCACOLA);
                        System.out.println("The " + DrinksMachine.COCACOLA.getDrink() + " is done.");
                        break;
                    }
                    case WATER -> {
                        totalPrice += Drink.PRICES.get(WATER);
                        System.out.println("The " + DrinksMachine.WATER.getDrink() + " is done.");
                        break;
                    }
                    default -> {
                        System.out.println("something went wrong");
                    }
                }
            } else {
                System.out.println("Wrong data, try again!");
            }


        }


    }
}





