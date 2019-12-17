import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	int n, fila, col;
	
		System.out.println("Digite las lineas: ");
		n =sc.nextInt();
		
		int [][]matriz = new int [n][n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j || i+j==n-1) {
					matriz[i][j]=1;
				}else  {
					matriz[i][j]=0;
				}
			}
	}
		imprimirMatriz(matriz);
	}
		public static void imprimirMatriz(int [][] matriz) {
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz.length; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
		}

public static void imprimirMatriz(double [][] matriz) {
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz.length; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
		}
}

