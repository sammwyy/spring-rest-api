package com.github.sammwy.springrest.providers;

import com.github.sammwy.springrest.structure.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieProvider extends JpaRepository<Movie, Long> {

}
