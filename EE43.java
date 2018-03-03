
public class EE43 {
	public static int NbRollDice (int N){
		int x,y,i=0;
		do{
			i++;
			x=(int) Math.random()*11+1;
			y=(int) Math.random()*11+1;
		}while((x+y)!=N);
		return i;
	}
	
    public static void main (String[] args) {
    	int a=0,r=0;
    	System.out.print("First number: ");
        a = TextIO.getInt();
        if ((a<=12)&&(a>=1)){
        	r=NbRollDice(a);
        	System.out.print("a: "+a);
        }
    }
	
}
