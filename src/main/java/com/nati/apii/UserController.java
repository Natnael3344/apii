package com.nati.apii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Configuration
public class UserController {
    private final UserConfig userConfig;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserController(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

    @PostMapping("/register")
    public User Register(@RequestBody User user) {
        return userRepository.save(user);
    }
    @PostMapping("/login")
    public User Login(@RequestBody User user) {
        User oldUSer = userRepository.findByEmailAndPassword(user.email, user.password);
        return oldUSer;
    }
    @GetMapping
    public List<User> getUsers(){
        return userConfig.getUser();
    }


}

