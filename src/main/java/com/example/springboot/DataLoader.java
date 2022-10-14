package com.example.springboot;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {
    private final UserRepository userRepository;

    private DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("DB Initialize");
        List<User> userList = new ArrayList<>() {
            {
                add(new User("Linus", "Torvalds", 52));
                add(new User("James", "Gosling", 67));
                add(new User("Steve", "Jobs", 56));
                add(new User("Tim", "Berners-Lee", 67));
                add(new User("Bill", "Gates", 66));
                add(new User("Alan", "Turing", 41));
            }
        };
        userRepository.saveAll(userList);
    }
}
