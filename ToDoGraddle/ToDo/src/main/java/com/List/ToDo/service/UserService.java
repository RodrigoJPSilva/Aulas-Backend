package com.List.ToDo.service;

import com.List.ToDo.dto.UserDTO;
import com.List.ToDo.entities.User;
import com.List.ToDo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserDTO criarUser(UserDTO dto) {
        User user = new User(dto);
        return dto;
    }
}
