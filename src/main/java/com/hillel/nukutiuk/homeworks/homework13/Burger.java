package com.hillel.nukutiuk.homeworks.homework13;

public class Burger {

    public Burger(String bun, String meat, String green, String cheese) {
        System.out.println(bun + " " + meat + " " + green + " " + cheese);
    }

    public Burger(String bun, String meat, String green, String mayonnaise, String cheese) {
        System.out.println(bun + " " + meat + " " + green + " " + mayonnaise + " " + cheese);

    }

    public Burger(String bun, String meat, String doubleMeat, String green, String mayonnaise, String cheese) {
        System.out.println(bun + " " + doubleMeat + " " + green + " " + mayonnaise + " " + cheese);
    }

}
