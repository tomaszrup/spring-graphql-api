package com.tomaszrup.graphql.user;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

interface UserRepository extends MongoRepository<User, ObjectId> {

}
