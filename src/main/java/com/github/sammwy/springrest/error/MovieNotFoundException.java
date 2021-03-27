package com.github.sammwy.springrest.error;

public class MovieNotFoundException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MovieNotFoundException(Long id) {
        super("Movie id not found : " + id);
    }
}
