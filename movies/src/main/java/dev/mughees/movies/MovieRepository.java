package dev.mughees.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>  {
    // Spring Mongo db understands what we want just by seeing this command findMovieByImdbId
    Optional<Movie> findMovieByImdbId(String imdbId);

}
