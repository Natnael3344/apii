package com.nati.apii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserConfig {
  private final UserRepository userRepository;
    @Autowired
    public UserConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Bean
    public List<User> getUser(){
        return userRepository.findAll();
    }

}
