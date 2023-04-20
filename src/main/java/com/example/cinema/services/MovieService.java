package com.example.cinema.services;
mport org.springframework.beans.factory.annotation.Autowired;
import com.example.cinema.models.Movie;
import com.example.cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    private ArrayList<Movie> moviesList;
    Movie movie;

    //    update movie
    public ArrayList<Movie> addMovie(Movie movie) {
        moviesList.add(movie);
        return moviesList;


//        try with response entity

        public ResponseEntity<Movie> addMovie(Movie movie)  {
            ArrayList list = moviesList.add(movie);
            return new ResponseEntity<(movie, HttpStatus.CREATED)>;
//
            public ResponseEntity<Movie> getMovieById(@PathVariable Movie movie)
            int id = movie.getId();
//        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.getId(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        }
//  public ResponseEntity<Movie> addMovie(@PathVariable int id)
        }

//    get movie id

        public Movie getMovieId(Movie movie) {
            return this.movie.getId();
        }
    }
}
