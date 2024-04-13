package com.Prince.QuizApp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
@EnableAutoConfiguration
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
