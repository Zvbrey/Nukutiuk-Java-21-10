package com.hillel.nukutiuk.homeworks.homework17;

public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("ЧАЙ"),
    LEMONADE("Лимонад"),
    MOJITO("Монітор"),
    WATER("Мінералка"),
    COCACOLA("Кока_кола");

    private String nameDrink;

    DrinksMachine(String nameDrink){
        this.nameDrink = nameDrink;
    }

    public String getDrink(){
        return nameDrink;
    }
}
