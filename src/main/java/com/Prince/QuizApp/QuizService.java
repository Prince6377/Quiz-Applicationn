package com.Prince.QuizApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
	private QuizDao quizdao;
    @Autowired
    private QuestionDao questiondao;
	public ResponseEntity<String> createQuiz(String category, int numQ, String tittle) {
	
		List<QuestionDB> questions = questiondao.findRandomQuestionsByCategory(category,numQ);
		Quiz quiz = new Quiz();
		quiz.setTittle(tittle);
		quiz.setQuestions(questions);
		quizdao.save(quiz);
		return new ResponseEntity<>("Sucess",HttpStatus.CREATED);
	}
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		
		Optional<Quiz> quiz = quizdao.findById(id);
		List<QuestionDB> questionFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionForUser = new ArrayList<>();
		for(QuestionDB q : questionFromDB) {
			QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestion(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
			questionForUser.add(qw);
		}
		
		return new ResponseEntity<>(questionForUser,HttpStatus.OK);
	}
	

}
