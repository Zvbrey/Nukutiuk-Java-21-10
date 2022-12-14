package com.hillel.nukutiuk.homeworks.homework16.musicStyles;

public abstract class MusicStyles {

    private final String band;

    public String getBand() {
        return band;
    }

    public MusicStyles (String band){
        this.band = band;
    }

    public abstract void playMusic();
}
