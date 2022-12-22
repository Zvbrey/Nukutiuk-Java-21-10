package com.hillel.nukutiuk.homeworks.homework17;

public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("ЧАЙ"),
    LEMONADE("Лимонад"),
    MOJITO("Монітор"),
    MINERALWATER("Мінералка"),
    COCACOLA("Кока_кола");

    private String drink;

    DrinksMachine(String drink){
        this.drink = drink;
    }

    public String getDrink(){
        return drink;
    }
}
