package com.tomaszrup.graphql.book.domain;

import com.tomaszrup.graphql.book.domain.dto.BookDto;
import com.tomaszrup.graphql.infrastructure.MongoCollections;
import lombok.Builder;
import lombok.Getter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(MongoCollections.BOOKS)
@Getter
@Builder
class Book {

  @Id
  private ObjectId id;
  private String   name;
  private String   description;
  private ObjectId authorId;

  public BookDto dto() {
    return BookDto.builder()
        .id(id)
        .name(name)
        .description(description)
        .authorId(authorId)
        .build();
  }

}
