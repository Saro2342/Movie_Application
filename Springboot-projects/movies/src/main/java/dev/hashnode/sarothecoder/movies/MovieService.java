package dev.hashnode.sarothecoder.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	public List<Movie> findAllMovies(){
		System.out.println(repository.findAll().toString());
		return repository.findAll();
	}
	
	public Movie findSingleMovie(String imdbId) {
		return repository.findMovieByImdbId(imdbId);
	}
}
