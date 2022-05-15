package com.eacode.dsmovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eacode.dsmovie.entities.Movie;
public interface MovieRepository extends JpaRepository<Movie, Long> {

    
}
