package dev.mughees.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Works between the sevrice class and database
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
