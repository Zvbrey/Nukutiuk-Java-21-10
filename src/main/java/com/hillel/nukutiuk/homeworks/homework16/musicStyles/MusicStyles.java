package com.hillel.nukutiuk.homeworks.homework16.musicStyles;

public abstract class MusicStyles {

    private String band;

    public String getBand() {
        return band;
    }

    public MusicStyles (String band){
        this.band = band;
    }

    public abstract void playMusic();
}
