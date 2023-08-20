package com.weblessons.security.service;

import com.weblessons.security.dto.UserRegistrationDTO;
import com.weblessons.security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO userRegistrationDTO);

    List<User> getAll();
}
