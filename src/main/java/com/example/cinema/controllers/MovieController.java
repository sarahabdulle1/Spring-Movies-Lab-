package com.example.cinema.controllers;


import com.example.cinema.models.Movie;
import com.example.cinema.repositories.MovieRepository;
import com.example.cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    @Autowired
    MovieService movieService;
    MovieRepository movieList;
    @PostMapping

//        get the movie
    @GetMapping
    public ResponseEntity<Movie> addMovie(Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>((movie, HttpStatus.OK));

    }
    //    get the movie id
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieIdByMovie(@PathVariable Movie movie){
        movieService.getMovieId(movie);
        return new ResponseEntity<>((movie, HttpStatus.OK));

    }

//    path variable where we are going, request body where we are



}
