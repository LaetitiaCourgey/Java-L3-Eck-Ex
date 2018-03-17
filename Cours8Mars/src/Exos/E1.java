package Exos;

import java.util.Scanner;
/**
 * Classe contenant les deux tableaux d'entiers donnés par l'utilisateur
 * @author ig01903
 *
 */
public class E1 {
	private static int[] tab1;
	private static int[] tab2;
	/*
	 * Main va afficher le premier tableau puis le second et enfin l'union des deux
	 */
	public static void main (String[] args) {
		tab1=new int[1000];
		tab2=new int[1000];
		int j=0,k=0;
		int r=5,i=0;
		Scanner sc;
		while(r!=0){
			sc=new Scanner(System.in);
			String str = sc.nextLine();
			r=Integer.parseInt(str);
			if(r!=0){
				tab1[i]=r;
				i++;
			}
		}
		j=i;
		r=5;
		i=0;
		while(r!=0){
			sc=new Scanner(System.in);
			String str = sc.nextLine();
			r=Integer.parseInt(str);
			if(r!=0){
				tab2[i]=r;
				i++;
			}
		}
		k=i;
		//System.out.println("tab1");
		for(i=0;i!=j;i++){
			System.out.printf("%d,",tab1[i]);
		}
		System.out.println();
		//System.out.println("tab2");
		for(i=0;i!=k;i++){
			System.out.printf("%d,",tab2[i]);
		}
		System.out.println();
		for(i=0;i!=j;i++){
			System.out.printf("%d,",tab1[i]);
		}
		for(i=0;i!=k;i++){
			System.out.printf("%d,",tab2[i]);
		}
	}
	
	
	
	
	
}
