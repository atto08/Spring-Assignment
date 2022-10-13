package com.sparta.assign3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Assign3Application {

    public static void main(String[] args) {
        SpringApplication.run(Assign3Application.class, args);
    }

}
