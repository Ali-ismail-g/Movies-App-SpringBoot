package dev.ismail.movies.service;

import dev.ismail.movies.entity.Movie;
import dev.ismail.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //order spring to instantiate this class
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll(); //findAll already implemented method in MongoRepository<Movie, ObjectId>
    }
    public Optional<Movie> getMovie(ObjectId id){
        return movieRepository.findById(id); //optional is use as in case id wasn't found
    }
    public Optional<Movie> getMovieByImdbId(String imdbId){
        return movieRepository.getSingleMovieByImdbId(imdbId);
    }
}
