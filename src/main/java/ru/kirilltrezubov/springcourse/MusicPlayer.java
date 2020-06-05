package ru.kirilltrezubov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.kirilltrezubov.springcourse.playerEnum.MusicPlayerEnum;

import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;


    private Music music2;
    private Music music3;
    private Music music1;

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2, @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(MusicPlayerEnum musicPlayerEnum) {
        String song = "";
        switch (musicPlayerEnum) {
            case ROCK:
                song = music1.getSong().get((int)(Math.random() * 3));
                break;
            case CLASSICAL:
                song = music2.getSong().get((int)(Math.random() * 3));
                break;
            case RAP:
                song = music3.getSong().get((int)(Math.random() * 3));
        }
        return "Playing: " + song;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }
}

