package com.hillel.nukutiuk.homeworks.homework5;

public class Main {
    public static void main(String[] args) {

        int liArmy = 860, liWarrior = 13, liBowman = 24, liRider = 46;
        int minWarrior = 9, minBowman = 35, minRider = 12;
        double minArmy = liArmy * 1.5;
        int militaryStrengthLi = (liArmy * liWarrior) + (liArmy * liBowman) + (liArmy * liRider);
        int militaryStrengthMin = (int) ((minArmy * minWarrior) + (minArmy * minBowman) + (minArmy * minRider));

        System.out.println("Сила армії Лі = " + militaryStrengthLi + "\n" + "Сила армії Мінь = " + militaryStrengthMin);


    }
}
