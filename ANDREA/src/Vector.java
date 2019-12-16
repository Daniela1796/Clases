import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int recorrer;
		int [] vector = new int [10];
		
		System.out.println("Número");
		recorrer = sc.nextInt();
		
		for(int i=0; i<vector.length; i++) {
			vector[i]=i+1;
			System.out.print(vector[i]);
		}
		System.out.println();
		do {
			
			int temp=vector[vector.length-1];
		for(int i=vector.length-1; i>=1; i--) {
			vector[i] = vector[i-1];
			
		}
		vector[0]=temp;
		recorrer--;
	}while(recorrer!=0);
		for(int i=0; i<vector.length; i++ ) {
			System.out.println(vector[i]);
		}
	}

}

//Poner los ceros en la derecha
