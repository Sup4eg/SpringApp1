package ru.kirilltrezubov.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> getMusics(){
        List<Music> musics = new ArrayList<>();
        musics.add(classicalMusic());
        musics.add(rapMusic());
        musics.add(rockMusic());
        return musics;
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(getMusics());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
