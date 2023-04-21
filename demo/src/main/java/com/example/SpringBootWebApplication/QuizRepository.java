package com.example.SpringBootWebApplication;
import org.springframework.data.repository.CrudRepository;

// import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends CrudRepository<quiz, Integer> {
    
}


