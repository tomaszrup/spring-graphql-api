package com.tomaszrup.graphql.book;

import com.tomaszrup.graphql.author.dto.AuthorDto;
import com.tomaszrup.graphql.book.dto.BookCreationDto;
import com.tomaszrup.graphql.book.dto.BookDto;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.types.ObjectId;

@GraphQLApi
public class BookFacade {

  private final BookRepository bookRepository;
  private final BookCreator bookCreator;

  BookFacade(BookRepository bookRepository, BookCreator bookCreator) {
    this.bookRepository = bookRepository;
    this.bookCreator = bookCreator;
  }

  @GraphQLMutation(name = "createBook")
  public BookDto save(@GraphQLArgument(name = "book") BookCreationDto bookCreationDto) {
    return bookRepository.save(bookCreator.from(bookCreationDto)).dto();
  }

  @GraphQLQuery(name = "book")
  public BookDto find(@GraphQLArgument(name = "id") String id) {
    return bookRepository.findByIdOrThrow(new ObjectId(id)).dto();
  }

  @GraphQLQuery(name = "books")
  public List<BookDto> findAllBooks() {
    return bookRepository.findAll().stream().map(Book::dto).collect(Collectors.toList());
  }

  @GraphQLQuery(name = "books")
  public List<BookDto> findAllBooksByAuthor(@GraphQLContext AuthorDto authorDto) {
    return bookRepository.findAll().stream().map(Book::dto).collect(Collectors.toList());
  }

}
