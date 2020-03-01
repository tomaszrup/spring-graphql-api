package com.tomaszrup.graphql.book.domain.exception;

public class BookNotFoundException extends RuntimeException {
  public BookNotFoundException() {
    super("Book not found");
  }
}
