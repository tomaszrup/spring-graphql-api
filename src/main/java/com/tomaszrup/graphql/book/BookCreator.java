package com.tomaszrup.graphql.book;

import com.tomaszrup.graphql.book.dto.BookCreationDto;

class BookCreator {

  public Book from(BookCreationDto bookCreationDto) {
    return Book.builder()
        .authorId(bookCreationDto.getAuthorId())
        .description(bookCreationDto.getDescription())
        .name(bookCreationDto.getName())
        .build();
  }

}
