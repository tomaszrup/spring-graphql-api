package com.tomaszrup.graphql.user;

import org.springframework.security.crypto.password.PasswordEncoder;

class UserService {

  private final PasswordEncoder passwordEncoder;

  UserService(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  public String hashPassword(String password) {
    return passwordEncoder.encode(password);
  }
}
