package com.project.projectx.service.impl;

import com.project.projectx.model.entity.dto.UserRegistrationDTO;
import com.project.projectx.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {

        System.out.println(userRegistrationDTO);

    }
}
