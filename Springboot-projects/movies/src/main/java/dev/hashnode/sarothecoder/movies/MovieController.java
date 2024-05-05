package dev.hashnode.sarothecoder.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<List<Movie>> getMovies(){
		return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<Movie> getSingleMovie(@PathVariable String imdbId) {
		return new ResponseEntity<Movie>(service.findSingleMovie(imdbId), HttpStatus.OK);
	}
}
