package movie_api.restcontroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import movie_api.entity.Movie;
import movie_api.exception.MovieNotFoundException;
import movie_api.service.MovieService;

//GET movie-api  -->allMovies 
@RestController
public class MovieRestController {
	@Autowired
	private MovieService movieServiceRef;
	//GET /movie-api
	@GetMapping("/movie-api")
	public Collection<Movie> retriveAll(){
		Collection<Movie> allMovies= movieServiceRef.retriveAll();
		return allMovies;
	}
	
	//GET /movie-api/{id}
	@GetMapping("/movie-api/{movieId}")
	public Movie retriveOne(@PathVariable Integer movieId) {
		Movie foundMovie= movieServiceRef.retriveOne(movieId);
//		System.out.println(foundMovie);
	/* if movie is found return that movie
	 * if movie is not found, throw
	 * MovieNotFoundException
		*/
		if(foundMovie == null) {
			MovieNotFoundException ex=new MovieNotFoundException("movie with given id not found", movieId);
			throw ex;
		}
		return foundMovie;
	}
	
	//POST /movie-api
	@PostMapping("/movie-api")
	private void create(@RequestBody Movie movieRef) {
		movieServiceRef.create(movieRef);
	}
	//PUT /movie-api
	@PutMapping("/movie-api")
	private void update(@RequestBody Movie movieRef) {
		movieServiceRef.update(movieRef);
    }
	
	//Delete /movie-api/{id}
	@DeleteMapping("/movie-api/{movieId}")
	public void deleteOne(@PathVariable Integer movieId) {
		 movieServiceRef.deleteOne(movieId);
	}
	
}

