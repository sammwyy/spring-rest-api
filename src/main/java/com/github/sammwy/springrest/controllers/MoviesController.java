package com.github.sammwy.springrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.github.sammwy.springrest.error.MovieNotFoundException;
import com.github.sammwy.springrest.providers.MovieProvider;
import com.github.sammwy.springrest.structure.Movie;

@RestController
public class MoviesController {

    @Autowired
    private MovieProvider provider;

    // Find
    @GetMapping("/movies")
    List<Movie> findAll() {
        return provider.findAll();
    }

    // Save
    // return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/movies")
    Movie createMovie(@RequestBody Movie movie) {
        return this.provider.save(movie);
    }

    // Find
    @GetMapping("/movies/{id}")
    Movie findOne(@PathVariable Long id) {
        return this.provider.findById(id).orElseThrow(() -> new MovieNotFoundException(id));
    }

    // Save or update
    @PutMapping("/movies/{id}")
    Movie saveOrUpdate(@RequestBody Movie movie, @PathVariable Long id) {
        return this.provider.findById(id).map(x -> {
            x.setName(movie.getName());
            x.setCategory(movie.getCategory());
            x.setDescription(movie.getDescription());
            x.setRelease(movie.getRelease());
            x.setRate(movie.getRate());
            return this.provider.save(x);
        }).orElseGet(() -> {
            movie.setID(id);
            return this.provider.save(movie);
        });
    }

    @DeleteMapping("/movies/{id}")
    void deleteMovie(@PathVariable Long id) {
        this.provider.deleteById(id);
    }

}
