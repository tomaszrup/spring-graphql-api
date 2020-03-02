package com.tomaszrup.graphql.user;

import com.tomaszrup.graphql.user.dto.SignUpDto;

class UserCreator {

  User from(SignUpDto signUpDto, String hashedPassword) {
    return User.builder()
        .email(signUpDto.getEmail())
        .name(signUpDto.getName())
        .password(hashedPassword)
        .build();
  }

}
