package ru.kirilltrezubov.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.kirilltrezubov.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
