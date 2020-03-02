package com.tomaszrup.graphql.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class UserConfiguration {

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  UserFacade userFacade(PasswordEncoder passwordEncoder, UserRepository userRepository) {
    return new UserFacade(new UserCreator(), new UserService(passwordEncoder), userRepository);
  }

}
