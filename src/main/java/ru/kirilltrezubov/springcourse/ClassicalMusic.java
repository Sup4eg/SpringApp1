package ru.kirilltrezubov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic () {}

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("Night on Bald Mountain");
        songs.add("Symphony No.40 in G minor, K550");
        return songs;
    }
}
