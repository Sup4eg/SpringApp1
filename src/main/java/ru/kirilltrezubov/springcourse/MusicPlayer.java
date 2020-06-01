package ru.kirilltrezubov.springcourse;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int volume;
    //IoC
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {}
    public void playMusic() {
        for (Music music: music)
            System.out.println("Playing: " + music.getSong());
    }
    public void setMusic(List<Music> music){
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

