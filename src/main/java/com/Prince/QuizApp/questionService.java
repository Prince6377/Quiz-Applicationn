package com.Prince.QuizApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class questionService {
    @Autowired
	private QuestionDao quizdao;
	public ResponseEntity<List<QuestionDB>> getAllQuestions() {
		try {
		return new ResponseEntity<>( quizdao.findAll(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity< String >add(QuestionDB questionDB) {
		try {
		quizdao.save(questionDB);
		return new ResponseEntity<>("sucess",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("null",HttpStatus.CREATED);
	}
	
	public ResponseEntity< String> deleteQuiz(int id) {
		try {
		quizdao.deleteById(id);
		return  new ResponseEntity<>("sucess",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
	}
	
	
	

}
