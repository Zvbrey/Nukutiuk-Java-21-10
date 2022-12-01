package com.hillel.nukutiuk.homeworks.homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger all = new Burger("Булка", "М'ясо", "Зелень","Майонез", "Cир");
        Burger dietary = new Burger("Булка", "М'ясо", "Зелень", "Cир");
        Burger doubleMeat = new Burger("Булка", "М'ясо","З подвійним м'ясом"
                , "Зелень","Майонез", "Cир");

    }
}