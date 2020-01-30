import java.util.Scanner;

public class MatricesMagicas {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		int sumaFilas=0;
		int [] fila = new int [3];
		int sumaColumnas=0;
		int [] columnas = new int [3];
		int sumaDiagonal=0;
		int sumaInvertida=0;
		int [][] matriz = new int [3][3];
		
		boolean iguales = true;
		
		for(int i=0; i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j]  = sc.nextInt();
			}
		}
		for(int i=0; i<matriz.length; i++) {
			sumaFilas=0;
			for(int j=0; j<matriz.length; j++) {
				sumaFilas=sumaFilas+matriz[i][j]; 
			}
			fila[i] = sumaFilas;
		}
		
		for(int i=0; i<matriz.length; i++) {
			sumaColumnas=0;
			for(int j=0; j<matriz.length; j++) {
				sumaColumnas=sumaColumnas+matriz[j][i];
			}
			columnas[i] = sumaColumnas;
		}
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(i==j) {
					sumaDiagonal = sumaDiagonal+matriz[i][j];
				}
				if(i+j==matriz.length-1) {
					sumaInvertida = sumaInvertida+matriz[i][j];
				}
				
				}
			}
		for(int i=0; i<fila.length; i++) {
				if(sumaDiagonal != fila[i]) {
					iguales = false;
				}else if(sumaInvertida != fila[i] ) {
					iguales= false;
				}else if(columnas [i]  != fila[i]) {
					iguales = false;
				}

		}
		System.out.println(iguales);
		}
	
	
	public static void imprimirMatriz(int [][] matriz) {
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void imprimirArreglo(int[] arreglo) {
		for(int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
