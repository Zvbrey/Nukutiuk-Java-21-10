package com.hillel.nukutiuk.homeworks.homework16.musicStyles.impl;

import com.hillel.nukutiuk.homeworks.homework16.musicStyles.MusicStyles;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String band) {
        super(band);
    }

    @Override
    public void playMusic() {
        System.out.println(getBand());
    }
}
