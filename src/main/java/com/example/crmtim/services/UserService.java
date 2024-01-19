package com.example.crmtim.services;

import com.example.crmtim.enums.Role;
import com.example.crmtim.models.User;
import com.example.crmtim.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public boolean createUser (User user){
        String email = user.getEmail();
        if(userRepository.findByEmail(email)!=null) return false;
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        log.info("Saving new User with email : {}", email);
        return true;
    }
}
