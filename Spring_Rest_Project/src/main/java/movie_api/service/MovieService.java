package movie_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.store.MovieStore;

@Service //Marks this class as a Service
public class MovieService {
	@Autowired
	private movie_api.repository.MovieRepository movieRepositoryRef; //not null
	
	public Collection<Movie> getAllMovie(){
		Collection<Movie> allMovies=movieRepositoryRef.getAllMovies(); //nullPOinterEX
		return allMovies;
	}
	public Movie getOneMovie(Integer id) {
		Movie foundMovie = movieRepositoryRef.getOneMovie(id);
		return foundMovie;
	}
	public void addNewMovie(Movie movieRef) {
		movieRepositoryRef.addNewMovie(movieRef);
	}

}
