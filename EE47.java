import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class EE47 {
	public static int[] res1 = new int[10]; 
    public static int[] res2 = new int[10]; 
    public static int[] res3 = new int[10];   
    public static int[] tab = new int[20]; 
	/**
	 * cree deux tableaux res1 et res2 avec les nombres des additions du quiz
	 */
	public static void QuizCreation (){
		int i;
		for(i=0;i<10;i++){
			res1[i]=(int) ((Math.random())*50);
		}
		for(i=0;i<10;i++){
			res2[i]=(int) ((Math.random())*50);
		}
	}
	
	/**
	 * affiche le quiz et stocke la reponse de l'utilisateur dans res3
	 */
	public static void PrintQuiz(){
		Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(res1[i]+"+"+res2[i]+"=?");
    		String str = sc.nextLine();
    		res3[i] = Integer.parseInt(str);
        }
        sc.close();
    }
	
	/**
	 * affiche chaque addition du quiz et la bonne reponse et dit a l'utilisateur s'il a eu juste ou non, affiche la note de l'utilisateur
	 */
	private static void GradeQuiz() {
	        int Nbbr= 0;
	        int note=0;
	        for (int i = 0; i < 10; i++) {
	            System.out.println(res1[i]+"+"+res2[i]+"="+(res1[i]+res2[i]));
	            if ( res3[i] == res1[i]+res2[i] ) {
	                System.out.println("Bonne réponse");
	                Nbbr++;
	            }
	            else {
	                System.out.println("mauvaise réponse, votre réponse était " + res3[i]);
	            }
	        }
	        note = Nbbr * 10;
	        System.out.println("Note :"+note);
	    }
	
	
	  
    public static void main(String[] args) {
          
        QuizCreation();
        PrintQuiz();
        GradeQuiz();
    }
	
	
}
