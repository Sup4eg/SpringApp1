package ru.kirilltrezubov.springcourse;

import org.springframework.beans.factory.annotation.Value;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;


    private List<Music> musics;


    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public String playMusic() {
        List<String> genrePlaylist = musics.get(new Random().nextInt(musics.size()))
                .getSong();
        return "Playing: " + genrePlaylist.get(new Random().nextInt(genrePlaylist.size()));
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public List<Music> getMusics() {
        return musics;
    }
}

