package com.Prince.QuizApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Quiz")
public class QuizController {
	
	@Autowired
	QuizService quizservice;
	
	@PostMapping(path =  "/create")
	public ResponseEntity< String> createQuiz(@RequestParam String category, @RequestParam int numQ , @RequestParam String tittle) {
		
		return quizservice.createQuiz(category,numQ,tittle);
		
	}
	
	@GetMapping(path = "/get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
		
		return quizservice.getQuizQuestions(id);
		
	}

}
