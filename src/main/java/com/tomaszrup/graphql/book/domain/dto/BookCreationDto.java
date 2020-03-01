package com.tomaszrup.graphql.book.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookCreationDto {

  private String   name;
  private String   description;
  private ObjectId authorId;

  public void setAuthorId(String authorId) {
    this.authorId = new ObjectId(authorId);
  }
}
