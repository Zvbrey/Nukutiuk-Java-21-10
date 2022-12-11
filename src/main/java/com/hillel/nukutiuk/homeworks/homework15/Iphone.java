package com.hillel.nukutiuk.homeworks.homework15;

public class Iphone implements IOS, Smartphones {

    @Override
    public void iOS() {
        System.out.println("Xiaomi top");
    }

    @Override
    public void call(String number) {
        System.out.println("I call to number " + number);
    }

    @Override
    public void sms(String massage, String number) {
        System.out.println(massage);
    }

    @Override
    public void internet(String searchStr) {
        System.out.println("Googles: " + searchStr);
    }
}
