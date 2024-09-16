package dev.mughees.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movierepository;
    
    public List<Movie> allMovies() {
        return movierepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movierepository.findMovieByImdbId(imdbId);
    }

}
