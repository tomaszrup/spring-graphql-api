package com.tomaszrup.graphql.author;

import com.tomaszrup.graphql.author.dto.AuthorDto;
import com.tomaszrup.graphql.infrastructure.MongoCollections;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(MongoCollections.AUTHORS)
@Getter
@Setter
@Builder
class Author {

  private ObjectId id;
  private String   name;

  public AuthorDto dto() {
    return AuthorDto.builder()
        .id(id)
        .name(name)
        .build();
  }
}
