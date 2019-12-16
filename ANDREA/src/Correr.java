import java.util.Scanner;

public class Correr {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int[] vector= {3,4,0,0,9,-5,2,7,8};
		int repeticiones=1;
		
		do {
			repeticiones--;
		for(int i=0; i<vector.length; i++) {
			if(vector[i]==0) {
				for(int j=i; j<vector.length-1; j++) {
					if(vector[j+1]==0 && (j+1)!=vector.length-1) {
						repeticiones++;
						System.out.println("n"+repeticiones);
					}
					vector[j]= vector[j+1];
					
				}
				
				vector[vector.length-1]=0;
				
			}
			System.out.println();
			imprimirVector(vector);
			System.out.println("n"+repeticiones);
		}
		System.out.println("n"+repeticiones);
		}while(repeticiones!=0);
		imprimirVector(vector);
		System.out.println("____");
	}
	public static void imprimirVector(int arreglo []) {
		for(int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
