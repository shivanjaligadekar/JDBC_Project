package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import movie_api.entity.Movie;
import movie_api.repository.MovieRepository;
@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepositoryRef;
	
	public Collection<Movie> retriveAll(){
		Collection<Movie> allMovies = movieRepositoryRef.findAll();
		return allMovies;
		
	}
	public Movie retriveOne(Integer movieId) {
		Optional<Movie> optionalRef = movieRepositoryRef.findById(movieId);
		Movie foundMovie=null;
		if (optionalRef.isPresent())
			foundMovie=optionalRef.get();
		return foundMovie;
		
	}
	public void create(Movie movieRef) {
		movieRepositoryRef.save(movieRef);
	}
	public void update(Movie updatedMovieRef) {
		movieRepositoryRef.save(updatedMovieRef);
	}
	public void deleteOne(Integer movieId) {
		movieRepositoryRef.deleteById(movieId);
	}
}
