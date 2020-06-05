package ru.kirilltrezubov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("The wind has changed");
        songs.add("Kashmir");
        songs.add("Wind Cries Mary");
        return songs;
    }
}
