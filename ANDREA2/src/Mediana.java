import java.util.Scanner;

public class Mediana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamaño;
		
		System.out.println("Tamaño: ");
		tamaño = sc.nextInt();
		float temp;
		float[] vector = new float [tamaño];
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = (float)(Math.random()*9+1);
		}
		for(int i=0; i<vector.length-1; i++) {
			if(vector[i]>vector[i+1]) {
				temp = vector[i];
				vector[i]= vector[i+1];
				vector[i+1]=temp;
				int j=i;
				if(j>0) {
					while(j>0 && vector[j]<vector[j-1] ) {
						temp= vector[j];
						vector[j]= vector[j-1];
						vector[j-1]= temp;
						j--;
					}
				}
			}
			}
		imprimirArreglo(vector);
		System.out.println(vector[(int)tamaño/2]);
			}
	public static void imprimirArreglo(float[] arreglo) {
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		System.out.println();
	}
			
		}
		


