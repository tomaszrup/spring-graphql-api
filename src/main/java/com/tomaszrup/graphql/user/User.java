package com.tomaszrup.graphql.user;

import com.tomaszrup.graphql.infrastructure.MongoCollections;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(MongoCollections.USERS)
public class User {

}
