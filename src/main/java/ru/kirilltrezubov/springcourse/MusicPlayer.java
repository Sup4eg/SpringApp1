package ru.kirilltrezubov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.kirilltrezubov.springcourse.playerEnum.MusicPlayerEnum;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
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


}

