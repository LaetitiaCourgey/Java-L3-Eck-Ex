import java.util.Random;
import java.lang.Math;

public class EE47 {
	public static int[] QuizCreation (){
		int[] tab;
		int i;
		for(i=1;i<=20;i++){
			tab[i]=(int) ((Math.random())*100);
		}
		return tab;
	}
	
	public static int[] PrintQuiz(int[] res1,int[] res2){
		int[] res3;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d + %2d = ? ", res1[i], res2[i]);
            res3[i] = TextIO.getlnInt();
        }
        return res3;
    }
	
	
	private static void GradeQuiz(int[] res1, int[] res2, int[] res3) {
			
	        int NbCorrect = 0;
	        int grade;
	        for (int i = 0; i < 10; i++) {
	            System.out.printf("%2d + %2d  =  %2d ", res1[i], res2[i], res1[i]+res2[i]);
	            if ( res3[i] == res1[i]+res2[i] ) {
	                System.out.println("CORRECT");
	                NbCorrect++;
	            }
	            else {
	                System.out.println("Your answer was " + res3[i] + ",INCORRECT");
	            }
	        }
	        grade = NbCorrect * 10;
	        System.out.println();
	        System.out.println("Your grade is " + grade);
	    }
	
	
	  
    public static void main(String[] args) {
        int[] res1 = new int[10]; 
        int[] res2 = new int[10]; 
        int[] res3 = new int[10];   
        int[] tab = new int[20];   
        tab=QuizCreation();
        tab=QuizCreation();
		int i=0;
		for(i=0;i<=19;i++){
			if(i<=9){
				res1[i]=tab[i];
			}
			if((i>9)&&(i<20)){
				res1[i-10]=tab[i];
			}
		}
        res3=PrintQuiz(res1,res2);
        GradeQuiz(res1,res2,res3);
    }
	
	
}
