package com.tomaszrup.graphql.author.dto;

import lombok.Builder;
import lombok.Getter;
import org.bson.types.ObjectId;

@Getter
@Builder
public class AuthorDto {

  private ObjectId id;
  private String   name;

  public String getId() {
    return id.toHexString();
  }
}
