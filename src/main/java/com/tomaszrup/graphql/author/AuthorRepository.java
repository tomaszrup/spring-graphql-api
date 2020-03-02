package com.tomaszrup.graphql.author;

import com.tomaszrup.graphql.author.exception.AuthorNotFoundException;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

interface AuthorRepository extends MongoRepository<Author, ObjectId> {

  default Author findByIdOrThrow(ObjectId id) {
    return this.findById(id).orElseThrow(() -> new AuthorNotFoundException());
  }

}
