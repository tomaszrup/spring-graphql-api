package com.tomaszrup.graphql.user;

import com.tomaszrup.graphql.infrastructure.MongoCollections;
import com.tomaszrup.graphql.user.dto.UserDto;
import lombok.Builder;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(MongoCollections.USERS)
class User {

  private ObjectId id;
  private String name;
  private String email;
  private String password;

  public UserDto dto() {
    return UserDto.builder()
        .email(email)
        .id(id)
        .name(name)
        .build();
  }

}
