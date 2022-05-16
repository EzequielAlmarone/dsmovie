package com.eacode.dsmovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eacode.dsmovie.entities.Score;
import com.eacode.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

    
}
