package com.project.projectx.model.entity.dto;

public record UserRegistrationDTO(String firstName,
                                  String lastName,
                                  String email,
                                  String password,
                                  String confirmPassword) {
}
