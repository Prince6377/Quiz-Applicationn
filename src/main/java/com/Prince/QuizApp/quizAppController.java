package com.Prince.QuizApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Quiz")
public class quizAppController {
	
	@Autowired
	private questionService question;
	@GetMapping(path = "/Questions")
	public ResponseEntity<List<QuestionDB>> allQuiz() {
		return question.getAllQuestions();
	}
	@PostMapping(path = "/add")
	public ResponseEntity<String> add(@RequestBody QuestionDB questionDB){
		 return question.add(questionDB);
	}

	@DeleteMapping(path ="/delete/{Id}")
	public ResponseEntity<String> delete(@PathVariable int Id) {
		return question.deleteQuiz(Id);
	}
}
