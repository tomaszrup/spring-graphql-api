package com.tomaszrup.graphql.book.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookCreationDto {
  private String   name;
  private String   description;
  private String   authorId;
}