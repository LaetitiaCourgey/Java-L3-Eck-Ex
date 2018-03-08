import java.util.Scanner;


public class EE43 {
	/**NbRollDice permet de compter le nombre de lancers de des pour obtenir n
	 * a est le premier des
	 * b le deuxieme des
	 * r est la somme des resultats des des
	 * @param n   nombre doit par l'utilisateur
	 * @return
	 */
	public static int NbRollDice (int n){
		if (n<1||n>12){
			throw new IllegalArgumentException("Le nombre doit être compris entre 2 et 12");
		}
		int r=-1,i=0,a=0,b=0;
		for(i=0;r!=n;i++){
			a=(int) (Math.random()*6+1);
			//System.out.print("a="+a);
			b=(int) (Math.random()*6+1);
			//System.out.print("b="+b);
			r=a+b;
			//System.out.print("r="+r);
		}
		return i;
	}
	
	
	
	/**
	 * n est le nombre donne par l'utilisateur
	 * r est le resultat de la fonction NbRollDice donc le nombre de lancers de des pour obtenir n
	 * @param args
	 */
	
	
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str);
		int r= NbRollDice(n);
    	System.out.print(r);
        sc.close();
        }
    }
