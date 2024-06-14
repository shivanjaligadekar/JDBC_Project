package movie_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import movie_api.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	/*No Further code for persistency.
	//It is managed internally
	//However, if any further coustomization is required that can be done.*/


}
