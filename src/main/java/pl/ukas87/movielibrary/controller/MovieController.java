package pl.ukas87.movielibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.ukas87.movielibrary.model.Movie;
import pl.ukas87.movielibrary.repository.MovieRepository;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/test")
    public int test() {
        return 1;
    }

    @GetMapping("/movies")
    public List<Movie> getAll(){
       return movieRepository.getAll();
    }

    @GetMapping("/movies/{id}")
    public Movie getById(@PathVariable("id") int id){
        return movieRepository.getById(id);
    }
}
