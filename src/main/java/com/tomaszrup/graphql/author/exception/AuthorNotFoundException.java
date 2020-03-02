package com.tomaszrup.graphql.author.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AuthorNotFoundException extends RuntimeException {
  public AuthorNotFoundException() {
    super("Author not found.");
  }

}
