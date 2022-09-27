package com.dirask;

import com.dirask.model.UserEntity;
import com.dirask.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public ApplicationRunner applicationRunner(UserRepository userRepository) {

        return args -> {
            userRepository.save(new UserEntity("John Doe", 42));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
