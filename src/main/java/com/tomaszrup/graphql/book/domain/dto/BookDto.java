package com.tomaszrup.graphql.book.domain.dto;

import lombok.Builder;
import lombok.Getter;
import org.bson.types.ObjectId;

@Builder
@Getter
public class BookDto {

  private String   id;
  private String   name;
  private String   description;
  private String   authorId;
}
