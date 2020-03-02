package com.tomaszrup.graphql.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {

  private String   name;
  private String   email;
  private String   password;
}
