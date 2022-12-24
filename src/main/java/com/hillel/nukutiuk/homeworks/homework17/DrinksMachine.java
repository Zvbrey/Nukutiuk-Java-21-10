package com.hillel.nukutiuk.homeworks.homework17;

public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("ЧАЙ"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    WATER("Мінералка"),
    COCACOLA("Кока_кола");

    private String nameDrink;

    DrinksMachine(String nameDrink){
        this.nameDrink = nameDrink;
    }

    public String getDrink(){
        return nameDrink;
    }

    public static String doDrink(DrinksMachine drinksMachine){
      return "Please wait, I make " + drinksMachine;
    }
}
