package com.tomaszrup.graphql.book;

import com.tomaszrup.graphql.book.exception.BookNotFoundException;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

interface BookRepository extends MongoRepository<Book, ObjectId> {

  default Book findByIdOrThrow(ObjectId id) {
    return this.findById(id).orElseThrow(() -> new BookNotFoundException());
  }

}
