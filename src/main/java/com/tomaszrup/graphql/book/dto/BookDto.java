package com.tomaszrup.graphql.book.dto;

import io.leangen.graphql.annotations.GraphQLIgnore;
import lombok.Builder;
import lombok.Getter;
import org.bson.types.ObjectId;

@Builder
@Getter
public class BookDto {

  private ObjectId   id;
  private String   name;
  private String   description;
  private ObjectId authorId;

  public String getId() {
    return id.toHexString();
  }

  @GraphQLIgnore
  public ObjectId getAuthorId() {
    return authorId;
  }
}
