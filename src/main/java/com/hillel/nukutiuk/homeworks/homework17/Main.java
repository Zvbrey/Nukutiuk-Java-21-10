package com.hillel.nukutiuk.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.nukutiuk.homeworks.homework17.DrinksMachine.*;

public class Main {
    public static void main(String[] args) {
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        String doneDrinkMessage = "The tasty %s is done.";
        int totalPrice = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please select a drink from the menu: " + Arrays.toString(drinksMachines) + " Or enter stop to complete the selection");


        while (true) {
            DrinksMachine drinks = null;
            String userValue = scn.nextLine().toUpperCase();

            if (userValue.equals("STOP")) {
                System.out.println("Total order price " + totalPrice + ". The number of drinks in the order " + Drink.counter);
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
                        System.out.println(doDrink(COFFEE));
                        System.out.println(String.format(doneDrinkMessage, COFFEE.getDrink()));
                        break;
                    }
                    case TEA -> {
                        totalPrice += Drink.PRICES.get(TEA);
                        System.out.println(doDrink(TEA));
                        System.out.println(String.format(doneDrinkMessage, TEA.getDrink()));
                        break;
                    }
                    case LEMONADE -> {
                        totalPrice += Drink.PRICES.get(LEMONADE);
                        System.out.println(doDrink(LEMONADE));
                        System.out.println(String.format(doneDrinkMessage, LEMONADE.getDrink()));
                        break;
                    }
                    case MOJITO -> {
                        totalPrice += Drink.PRICES.get(MOJITO);
                        System.out.println(doDrink(MOJITO));
                        System.out.println(String.format(doneDrinkMessage, MOJITO.getDrink()));
                        break;
                    }
                    case COCACOLA -> {
                        totalPrice += Drink.PRICES.get(COCACOLA);
                        System.out.println(doDrink(COCACOLA));
                        System.out.println(String.format(doneDrinkMessage, COCACOLA.getDrink()));
                        break;
                    }
                    case WATER -> {
                        totalPrice += Drink.PRICES.get(WATER);
                        System.out.println(doDrink(WATER));
                        System.out.println(String.format(doneDrinkMessage, WATER.getDrink()));
                        break;
                    }
                    default -> {
                        System.out.println("something went wrong");
                    }
                }
                System.out.println("Total order price " + totalPrice + ". The number of drinks in the order " + Drink.counter);
            } else {
                System.out.println("Wrong data, try again!");
            }
        }


    }
}





