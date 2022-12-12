package com.bluehair.bluehairtemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BluehairtempApplication {

    public static void main(String[] args) {
        SpringApplication.run(BluehairtempApplication.class, args);
    }

}
