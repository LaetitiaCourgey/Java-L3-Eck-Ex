package Exos;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Cette classe permet de generer un quiz, de l'afficher et de contabiliser les bonnes reponses de l'utilisateur
 * @author ig01903
 *
 */
public class EE57 {

    private static IntQuestion[] questions;  
    private static int[] userAnswers;  
/**
 * affiche le quiz et sauvegarde les reponses de l'utilisateur
 */
private static void doquiz() {
	Scanner sc;
	userAnswers = new int[10];
	int r;
	for (int i = 0; i < 10; i++) {
		questions[i].getQuestion();
		sc = new Scanner(System.in);
		String str = sc.nextLine();
		r=Integer.parseInt(str);
		userAnswers[i] = r;
	}
	
}

/**
 * affiche les bonnes reponses et le score final
 */
private static void Results() {
	int grade =0,numberCorrect=0,r;
	for(int i=0;i<10;i++){
		System.out.println("Question "+(i+1));
		questions[i].getQuestion();
		r=questions[i].getCorrectAnswer();
		if ( userAnswers[i] == r ) {
     	  System.out.println("CORRECT");
     	  numberCorrect++;
		}
		else {
			System.out.println("INCORRECT");
			System.out.println("Your answer was " + userAnswers[i]);
		}
	}
	grade = numberCorrect * 10;
	System.out.println("Your grade is " + grade);
}


/**
 * creer un quiz de 10 questions, 5 additions, 4 soustractions et 1 big question
 */
	public static void addquestions(){
		int i=0;
		for(i=0;i<5;i++){
			questions[i]=(new AdditionQuestion());
		}
		for(i=5;i<9;i++){
			questions[i]=(new SubtractionQuestion());
		}
		questions[9]=(new bigQuestion());
	}
	/**
	 * cree le quiz, l'affiche et donne le score final 
	 * @param args
	 */
	public static void main (String[] args) {
		questions = new IntQuestion[10];
		addquestions();
		doquiz();
		Results();
		
	}

}