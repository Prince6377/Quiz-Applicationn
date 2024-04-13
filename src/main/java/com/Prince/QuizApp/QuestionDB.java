package com.Prince.QuizApp;



import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class QuestionDB {
	
	@jakarta.persistence.Id
	private  Integer Id;
	private String Category;
	private String Difficulty_Level;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Right_Answer;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getDifficulty_Level() {
		return Difficulty_Level;
	}
	public void setDifficulty_Level(String difficulty_Level) {
		Difficulty_Level = difficulty_Level;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public String getRight_Answer() {
		return Right_Answer;
	}
	public void setRight_Answer(String right_Answer) {
		Right_Answer = right_Answer;
	}
	
	

}
