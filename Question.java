package Mcq;
import java.util.*;
public class Question
{
	private String question;
	private char answer,chosenAnswer;
	private int marks;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	public char getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(char chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
