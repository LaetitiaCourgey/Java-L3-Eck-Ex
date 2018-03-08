package Cours;
import p.PairOfDice;
import p.StatCalc;

/**
 * the function counts the number of roll that you need to obtain n equal to the sum of the dice
 * n is the number that we want 
 * p is the pair of dice
 * @author ig01903
 *
 */
public class EE53 {
	public static int EE51(int n){
		PairOfDice p= new PairOfDice();
		int die1= p.getdie1(),die2= p.getdie2(),i=0;
		for(i=1;die1+die2!=n;i++) {
			p= new PairOfDice();
			die1= p.getdie1();
			die2= p.getdie2();
		}
		return i;
	}
	
	/**
	 * the function counts the number of rolls that we need to obtain each number between 2 and 12
	 * and print the mean, deviation and max 
	 * i is used in a for, 0 to 10000
	 * j is used in a for, 2 to 12
	 * dice is the pair of dice I use to count the number of rolls for each j 
	 * dice is a pair of dice I use to do the global average 
	 * @param args
	 */
	public static void main (String[] args) {
		int i=0,j=0;
		StatCalc dice;
		StatCalc dice2=new StatCalc();
		for (j=2;j<=12;j++){
			dice=new StatCalc();
			for(i=0;i<10000;i++){
				dice.enter(EE51(j));
			}
			System.out.println("When n="+j+", the mean is "+dice.getMean()+", the deviation is "
					+dice.getStandardDeviation()+" and the max is "+dice.getMax());
			dice2.enter(dice.getMean());
		}
		System.out.println("The global mean is "+dice2.getMean()+", the deviation is "
				+dice2.getStandardDeviation()+" and the max is "+dice2.getMax());
		
	}
	
}
