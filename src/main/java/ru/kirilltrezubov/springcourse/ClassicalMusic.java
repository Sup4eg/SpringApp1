package ru.kirilltrezubov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic () {}

    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("Night on Bald Mountain");
        songs.add("Symphony No.40 in G minor, K550");
        return songs;
    }
}
