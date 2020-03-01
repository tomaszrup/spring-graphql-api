package com.tomaszrup.graphql.book.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BookConfiguration {

  @Bean
  BookFacade bookFacade(BookRepository bookRepository) {
    return new BookFacade(bookRepository, new BookCreator());
  }

}
