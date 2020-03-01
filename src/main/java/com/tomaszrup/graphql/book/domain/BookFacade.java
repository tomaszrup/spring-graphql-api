package com.tomaszrup.graphql.book.domain;

import com.tomaszrup.graphql.book.domain.dto.BookDto;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.bson.types.ObjectId;

@GraphQLApi
public class BookFacade {

  private final BookRepository bookRepository;
  private final BookCreator bookCreator;

  public BookFacade(BookRepository bookRepository, BookCreator bookCreator) {
    this.bookRepository = bookRepository;
    this.bookCreator = bookCreator;
  }

  public BookDto save(BookDto bookDto) {
    return bookDto;
  }

  public BookDto find(ObjectId id) {
    return bookRepository.findByIdOrThrow(id).dto();
  }


}
