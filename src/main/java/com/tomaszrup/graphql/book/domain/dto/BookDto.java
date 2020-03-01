package com.tomaszrup.graphql.book.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BookDto {

  private String   id;
  private String   name;
  private String   description;
  private String   authorId;
}
