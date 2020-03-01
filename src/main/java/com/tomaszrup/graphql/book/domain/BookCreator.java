package com.tomaszrup.graphql.book.domain;

import com.tomaszrup.graphql.book.domain.dto.BookDto;

class BookCreator {

  public Book fromDto(BookDto bookDto) {
    return Book.builder()
        .authorId(bookDto.getAuthorId())
        .description(bookDto.getDescription())
        .name(bookDto.getName())
        .build();
  }

}
