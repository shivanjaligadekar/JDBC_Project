package movie_api.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import movie_api.entity.Movie;
import movie_api.service.MovieService;
import movie_api.store.MovieStore;
//GET movie-api  -->allMovies 
@RestController
public class MovieRestController {
	@Autowired
	private MovieService movieServiceRef;
	
//	@RequestMapping("/movie-api")
	@GetMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovies=movieServiceRef.getAllMovie();
		return allMovies;
	}
	//GET /movie-api/99  ---> Get One Movie
//	@RequestMapping("/movie-api/{movieId}")
	@GetMapping("/movie-api/{movieId}")
	public Movie getOneMovie(@PathVariable("movieId")Integer id) {
		Movie foundMovie = movieServiceRef.getOneMovie(id);
		return foundMovie;
   }
	//post /movie-api
//	@RequestMapping(value="/movie-api",method=RequestMethod.POST)
	@PostMapping("/movie-api")
	public void addNewMovie(@RequestBody Movie movieRef) {
		System.out.println("Accept Movie:"+movieRef);
		movieServiceRef.addNewMovie(movieRef);
	}
}

