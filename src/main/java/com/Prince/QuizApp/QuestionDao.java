package com.Prince.QuizApp;
import java.util.List;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
@EnableConfigurationProperties
public interface QuestionDao extends JpaRepository<QuestionDB, Integer> {

	@org.springframework.data.jpa.repository.Query(value = "SELECT * FROM questiondb q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ ", nativeQuery  = true)
	List<QuestionDB> findRandomQuestionsByCategory(String category, int numQ);

	


	

	
}
