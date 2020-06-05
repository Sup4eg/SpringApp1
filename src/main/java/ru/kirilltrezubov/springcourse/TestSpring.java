package ru.kirilltrezubov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kirilltrezubov.springcourse.playerEnum.MusicPlayerEnum;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(MusicPlayerEnum.RAP));
        context.close();
    }
}
