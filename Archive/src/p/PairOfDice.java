package p;

public class PairOfDice {
	private int die1;
	private int die2;
	public int getdie1() {
		return die1;
	}
	public int getdie2() {
		return die2;
	}
	public String toString(){
	      return "die1="+die1+
	             " die2="+die2+"\n";
	}
	public PairOfDice() {
		die1=(int) (Math.random()*6+1);
		die2=(int) (Math.random()*6+1);
	}
}