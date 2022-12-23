package com.hillel.nukutiuk.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine drinks = null;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please select a drink from the menu: "
                + Arrays.toString(drinksMachines)
                + " Or enter stop to complete the selection");

        while (true) {
            String userValue = scn.nextLine().toUpperCase();

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

        switch (drinks){
            case COFFEE:{
                System.out.println("The "+ DrinksMachine.COFFEE.getDrink() + " is done");
                break;
            }
            case TEA:{

                break;
            }
            case LEMONADE:{
                break;
            }
            case MOJITO:{
                break;
            }
            case COCACOLA:{
                break;
            }
            case WATER:{
                break;
            }
        }


    }
}
