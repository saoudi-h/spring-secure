package com.saoudi.springsecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSecureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecureApplication.class, args);
    }

}
