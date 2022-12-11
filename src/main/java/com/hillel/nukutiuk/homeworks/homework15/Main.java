package com.hillel.nukutiuk.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        Android samsungGalaxyS9 = new Android();
        samsungGalaxyS9.call("0636028571");
        samsungGalaxyS9.sms("ni4ego ne nano", "0636028571");
        samsungGalaxyS9.internet("Hillel");
        samsungGalaxyS9.linuxOS();

        Iphone iphone = new Iphone();
        iphone.call("0636028571");
        iphone.sms("sms test", "0636028571");
        iphone.internet("ramble");
        iphone.iOS();
    }

}