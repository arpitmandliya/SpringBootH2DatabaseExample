package org.arpit.java2blog.service;
import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.model.Movie;
import org.arpit.java2blog.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<Movie>();
        movieRepository.findAll().forEach(movie -> movies.add(movie));
        return movies;
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).get();
    }

    public void saveOrUpdate(Movie mvoie) {
    	movieRepository.save(mvoie);
    }

    public void delete(int id) {
    	movieRepository.deleteById(id);
    }

}