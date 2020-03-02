package com.tomaszrup.graphql.user;

import com.tomaszrup.graphql.user.dto.SignUpDto;
import com.tomaszrup.graphql.user.dto.UserDto;

public class UserFacade {

  private final UserCreator    userCreator;
  private final UserService    userService;
  private final UserRepository userRepository;

  public UserFacade(UserCreator userCreator, UserService userService, UserRepository userRepository) {
    this.userCreator = userCreator;
    this.userService = userService;
    this.userRepository = userRepository;
  }

  public UserDto save(SignUpDto signUpDto) {
    User user = userCreator.from(signUpDto, userService.hashPassword(signUpDto.getPassword()));
    return userRepository.save(user).dto();
  }

}
