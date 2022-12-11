package com.hillel.nukutiuk.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        Samsung s9 = new Samsung();
        Iphone max9 = new Iphone();

    }

}
class Samsung implements LinuxOS, Smartphones{



    @Override
    public void linuxOS() {

    }

    @Override
    public void call() {

    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }
}
class Iphone implements IOS, Smartphones{

    @Override
    public void iOS() {

    }

    @Override
    public void call() {

    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }
}