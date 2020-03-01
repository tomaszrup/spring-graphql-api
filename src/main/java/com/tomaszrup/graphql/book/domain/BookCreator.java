package com.tomaszrup.graphql.book.domain;

import com.tomaszrup.graphql.book.domain.dto.BookCreationDto;
import com.tomaszrup.graphql.book.domain.dto.BookDto;
import org.bson.types.ObjectId;

class BookCreator {

  public Book from(BookCreationDto bookCreationDto) {
    return Book.builder()
        .authorId(bookCreationDto.getAuthorId())
        .description(bookCreationDto.getDescription())
        .name(bookCreationDto.getName())
        .build();
  }

  public Book from(BookDto bookDto) {
    return Book.builder()
        .authorId(new ObjectId(bookDto.getAuthorId()))
        .description(bookDto.getDescription())
        .name(bookDto.getName())
        .build();
  }

}
