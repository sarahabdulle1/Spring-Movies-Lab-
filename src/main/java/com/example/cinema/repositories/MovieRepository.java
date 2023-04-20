package com.example.cinema.repositories;

import com.example.cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    //model and the wrapper type of the id
}
