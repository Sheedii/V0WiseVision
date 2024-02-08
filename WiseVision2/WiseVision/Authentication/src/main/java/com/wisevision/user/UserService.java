package com.wisevision.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    public User registerNewUser(User user){
        return userRepository.save(user);
    }

}
