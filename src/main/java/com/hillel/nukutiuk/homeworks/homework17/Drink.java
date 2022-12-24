package com.hillel.nukutiuk.homeworks.homework17;

import java.util.EnumMap;
import java.util.Map;

import static com.hillel.nukutiuk.homeworks.homework17.DrinksMachine.*;

public class Drink {
    public static int counter;

    public Drink() {
        counter++;
    }

    public static final EnumMap<DrinksMachine, Integer> PRICES = new EnumMap<>(Map.of(
            COFFEE, 7,
            DrinksMachine.TEA, 8,
            DrinksMachine.LEMONADE, 9,
            DrinksMachine.MOJITO, 10,
            DrinksMachine.WATER, 11,
            DrinksMachine.COCACOLA, 12
    ));


}
