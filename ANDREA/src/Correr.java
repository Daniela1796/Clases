import java.util.Scanner;

public class Correr {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int[] vector= {3,4,0,0,9,-5,2,0,8};
		int acumulador =0;
		
		for(int i=0; i<vector.length; i++) {
			if(vector[i]==0) {
				vector[i]=acumulador;
				for(int j=i; j<vector.length-1; j++) {
					vector[j]= vector[j+1];
				}
				vector[vector.length-1]=0;
			}
			System.out.println(vector[i]);
		}
	}
}
