package com.tomaszrup.graphql.author;

import com.tomaszrup.graphql.author.dto.AuthorDto;
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
public class AuthorFacade {

  private final AuthorRepository authorRepository;
  private final AuthorCreator    authorCreator;

  AuthorFacade(AuthorRepository authorRepository, AuthorCreator authorCreator) {
    this.authorRepository = authorRepository;
    this.authorCreator = authorCreator;
  }

  @GraphQLMutation(name = "createAuthor")
  public AuthorDto save(@GraphQLArgument(name = "name") String name) {
    return authorRepository.save(authorCreator.from(name)).dto();
  }

  @GraphQLQuery(name = "author")
  public AuthorDto find(@GraphQLArgument(name = "id") String id) {
    return authorRepository.findByIdOrThrow(new ObjectId(id)).dto();
  }

  @GraphQLQuery(name = "author")
  public AuthorDto find(@GraphQLContext BookDto bookDto) {
    return authorRepository.findByIdOrThrow(bookDto.getAuthorId()).dto();
  }

  @GraphQLQuery(name = "authors")
  public List<AuthorDto> findAll() {
    return authorRepository.findAll().stream().map(Author::dto).collect(Collectors.toList());
  }

}
