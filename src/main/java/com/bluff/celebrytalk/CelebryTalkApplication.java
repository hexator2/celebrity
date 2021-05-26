package com.bluff.celebrytalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CelebryTalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(CelebryTalkApplication.class, args);
    }

}
