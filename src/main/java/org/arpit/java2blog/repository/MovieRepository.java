	package org.arpit.java2blog.repository;
	
	import org.arpit.java2blog.model.Movie;
	import org.springframework.data.repository.CrudRepository;
	
	public interface MovieRepository extends CrudRepository<Movie, Integer> {}