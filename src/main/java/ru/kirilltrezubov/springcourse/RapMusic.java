package ru.kirilltrezubov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Not Afraid");
        songs.add("Ringer");
        songs.add("Fall");
        return songs;
    }
}
