import java.util.Scanner;

public class Menu3 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
	
		int opcion;
		do {
			System.out.println("1. Mostrar plano de la sala");
			System.out.println("2. Vender un boleto");
			System.out.println("3. salir");
			
			System.out.println("Opción:");
			opcion=sc.nextInt();
			switch(opcion) {
			
			case 1:
				char ocupado = 'O';
				char vacio = '_';
				char [][] asientos = new char[8][20];
				int [][] filacol = new int [8][20];
				
				rellenarMatriz(asientos, vacio);
				System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20");
				mostrarPlano(asientos);
				System.out.println("****************PANTALLA****************");
				break;
				
			case 2:
				int fila, col;
			
			}
		}while(opcion!= 3);
	}

	public static void rellenarMatriz (char [][]matriz, char simbolo) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matriz[i][j]=simbolo;
			}
		}
	}
	public static void mostrarPlano(char [][]matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
			System.out.print(matriz[i][j]+" ");
          }
		System.out.println();	
	}
}
		public static void pedirAsiento(char[][]matriz) {
			
		}
}

