package com.hillel.nukutiuk.homeworks.homework14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Registration user1 = new Registration("Alex", "zvb@gmail.com", 10, 1, 1992
                , 936025454, 75, 210, 214275, "Leonhard");
        Registration user2 = new Registration("Oleg", "asf@gmail.com", 11, 2, 1993
                , 936025555, 85, 200, 211475, "Bobrhard");
        Registration user3 = new Registration("Sveta", "jfg@gmail.com", 12, 3, 1994
                , 936025656, 65, 230, 214755, "Jirafhard");
        Registration user4 = new Registration("Mariska", "fdgj@gmail.com", 13, 4, 1995
                , 936025757, 55, 220, 121475, "Velzevil");
        Registration user5 = new Registration("Artur", "asdfg@gmail.com", 14, 5, 1996
                , 936025959, 95, 250, 201475, "Diablo");

        System.out.println(user1.accountInfo());
        System.out.println(user2.accountInfo());
        System.out.println(user3.accountInfo());
        System.out.println(user4.accountInfo());
        System.out.println(user5.accountInfo());

        user1.setLastName("Lamina");
        user1.setNumberOfSteps(321321);

        user2.setPressure(123);
        user2.setWeight(94);

        System.out.println(user1.accountInfo());
        System.out.println(user2.accountInfo());
    }
}
