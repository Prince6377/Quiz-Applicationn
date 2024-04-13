package com.Prince.QuizApp;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String tittle;
	@ManyToMany
	private List<QuestionDB> questions;
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public List<QuestionDB> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionDB> questions) {
		this.questions = questions;
	}
	

}
