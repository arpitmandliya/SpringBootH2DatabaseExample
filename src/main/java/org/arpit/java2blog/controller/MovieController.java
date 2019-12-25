package org.arpit.java2blog.controller;
import java.util.List;

import org.arpit.java2blog.model.Movie;
import org.arpit.java2blog.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    private List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    private Movie getMovie(@PathVariable("id") int id) {
        return movieService.getMovieById(id);
    }

    @DeleteMapping("/movies/{id}")
    private void deleteMovie(@PathVariable("id") int id) {
        movieService.delete(id);
    }

    @PostMapping("/movies")
    private int saveMovie(@RequestBody Movie movie) {
        movieService.saveOrUpdate(movie);
        return movie.getId();
    }
}