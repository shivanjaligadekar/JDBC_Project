package movie_api.repository;

import java.util.Collection;
import org.springframework.stereotype.Repository;
import movie_api.entity.Movie;
import movie_api.store.MovieStore;

@Repository //marks this class as a Repository
public class MovieRepository {
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovie=MovieStore.getAllMovies();
		return allMovie;
		
	}
	public Movie getOneMovie(Integer id) {
		Movie foundMovie= MovieStore.getOneMovie(id);
		return foundMovie;
	}
	public void addNewMovie(Movie movieRef) {
		MovieStore.addNewMovie(movieRef);
	}

}
