package com.tomaszrup.graphql.author;

class AuthorCreator {

  public Author from(String name) {
    return Author.builder()
        .name(name)
        .build();
  }

}
