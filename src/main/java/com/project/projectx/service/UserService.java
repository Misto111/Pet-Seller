package com.project.projectx.service;

import com.project.projectx.model.entity.dto.UserRegistrationDTO;
import org.springframework.stereotype.Service;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);
}
