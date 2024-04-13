package com.Prince.QuizApp;

import lombok.Data;

@Data
public class QuestionWrapper {
	private  Integer Id;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	public QuestionWrapper(Integer id, String question, String option1, String option2, String option3,
			String option4) {
		super();
		Id = id;
		Question = question;
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
	}
	
	

}
