package com.tomaszrup.graphql.book.domain;

import com.tomaszrup.graphql.book.domain.dto.BookDto;
import org.bson.types.ObjectId;

class BookCreator {

  public Book fromDto(BookDto bookDto) {
    return Book.builder()
        .authorId(new ObjectId(bookDto.getAuthorId()))
        .description(bookDto.getDescription())
        .name(bookDto.getName())
        .build();
  }

}
