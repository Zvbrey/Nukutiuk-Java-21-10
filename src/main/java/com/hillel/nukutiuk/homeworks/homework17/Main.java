package com.hillel.nukutiuk.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.nukutiuk.homeworks.homework17.DrinksMachine.COFFEE;

public class Main {
    public static void main(String[] args) {
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine drinks = null;
        int totalPrice = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please select a drink from the menu: "
                + Arrays.toString(drinksMachines)
                + " Or enter stop to complete the selection");


        while (true) {

            String userValue = scn.nextLine().toUpperCase();

            if (userValue.equals("STOP")) {
                System.out.println("Total order price "
                        + totalPrice
                        + ". The number of drinks in the order "
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
                break;
            } else {
                System.out.println("Wrong data, try again!");
            }

        }


        switch (drinks) {
            case COFFEE -> {
                totalPrice += Drink.PRICES.get(COFFEE);
                System.out.println("The " + COFFEE.getDrink() + " is done.");
                break;
            }
            case TEA -> {
                totalPrice += Drink.PRICES.get(DrinksMachine.TEA);
                System.out.println("The " + DrinksMachine.TEA.getDrink() + " is done.");
                break;
            }
            case LEMONADE -> {
                totalPrice += Drink.PRICES.get(DrinksMachine.LEMONADE);
                System.out.println("The " + DrinksMachine.LEMONADE.getDrink() + " is done.");
                break;
            }
            case MOJITO -> {
                totalPrice += Drink.PRICES.get(DrinksMachine.MOJITO);
                System.out.println("The " + DrinksMachine.MOJITO.getDrink() + " is done.");
                break;
            }
            case COCACOLA -> {
                totalPrice += Drink.PRICES.get(DrinksMachine.COCACOLA);
                System.out.println("The " + DrinksMachine.COCACOLA.getDrink() + " is done.");
                break;
            }
            case WATER -> {
                totalPrice += Drink.PRICES.get(DrinksMachine.WATER);
                System.out.println("The " + DrinksMachine.WATER.getDrink() + " is done.");
                break;
            }
            default -> {
                System.out.println("SS");
            }
        }

        System.out.println(totalPrice);
    }

}





