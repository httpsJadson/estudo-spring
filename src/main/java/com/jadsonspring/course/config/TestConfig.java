package com.jadsonspring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jadsonspring.course.entities.User;
import com.jadsonspring.course.reporistories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Jadson", "888888888", "jadson1@email.com", "123456");
        User u2 = new User(null, "Jadson", "888888888", "jadson2@email.com", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
