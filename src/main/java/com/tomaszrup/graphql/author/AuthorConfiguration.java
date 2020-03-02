package com.tomaszrup.graphql.author;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AuthorConfiguration {

  @Bean
  AuthorFacade authorFacade(AuthorRepository authorRepository) {
    return new AuthorFacade(authorRepository, new AuthorCreator());
  }

}
