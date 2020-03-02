package com.tomaszrup.graphql.user.dto;

import lombok.Builder;
import org.bson.types.ObjectId;

@Builder
public class UserDto {

  private ObjectId id;
  private String   name;
  private String   email;
  private String   password;
}
