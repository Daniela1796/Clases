import java.util.Scanner;

public class Menu3 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
	
		int opcion;
		String [][] filacol = new String[9][21];
		String ocupado = "O";
		String vacio = "_";
		boolean libre  =true;
		do {
			System.out.println("1. Mostrar plano de la sala");
			System.out.println("2. Vender un boleto");
			System.out.println("3. Farmacia");
			System.out.println("4. Salir");
			
			System.out.println("Opción:");
			opcion=Integer.parseInt(sc.nextLine());
			switch(opcion) {
			
			case 1:
				
				rellenarMatriz(filacol, vacio);
				mostrarPlano(filacol);
				System.out.println("*********************PANTALLA************************");
				break;
				
			case 2:
				String fila, col;
				String entrada;
				fila = separarCaracter(0);
				validarAsiento(filacol, vacio,ocupado,libre);
				precioBoleto(fila);
				
				break;
			case 3:
				int casos = 0;
				String trazo = null;
				String vacio1  =".";
				String restaurante = "R";
				String farmacia = "D";
				String resyfar  ="Z";
				entrada(casos,trazo);
				
			}
		}while(opcion!= 4);
	}

	public static void rellenarMatriz (String [][]matriz, String simbolo) {
		String[] letras = {"A","B","C","D","E","F","G","H"};
		String []numeros = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
		String cero = "";
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
					matriz[i][j]=simbolo;
			}
		}
		matriz [0][0] = cero;
		matriz[1][0]= letras [0];
		matriz[2][0] = letras [1];
		matriz[3][0] = letras[2];
		matriz[4][0] = letras [3];
		matriz[5][0] = letras [4];
		matriz[6][0] = letras [5];
		matriz[7][0] = letras [6];
		matriz[8][0]  =letras [7];
		matriz[0][1] = numeros[0];
		matriz[0][2] = numeros[1];
		matriz[0][3] = numeros[2];
		matriz[0][4] = numeros[3];
		matriz[0][5] = numeros[4];
		matriz[0][6] = numeros[5];
		matriz[0][7] = numeros[6];
		matriz[0][8] = numeros[7];
		matriz[0][9] = numeros[8];
		matriz[0][10] = numeros[9];
		matriz[0][11] = numeros[10];
		matriz[0][12] =numeros[11];
		matriz[0][13] = numeros[12];
		matriz[0][14] = numeros[13];
		matriz[0][15] = numeros[14];
		matriz[0][16] = numeros[15];
		matriz[0][17] = numeros[16];
		matriz[0][18] = numeros[17];
		matriz[0][18] = numeros[18];
		matriz[0][19] = numeros[19];
	}
	public static void mostrarPlano(String [][]matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
			System.out.print(matriz[i][j]+"  ");
          }
		System.out.println();	
	}
}
	public static void validarAsiento(String[][]matriz, String simbolo, String ocup, boolean libre) {
		for(int i=1; i<matriz.length; i++) {
			for(int j=i; j<matriz.length; j++) {
				if(matriz[i][j]!= simbolo) {
					libre =false;
				}else {
					libre = true;
				}
			}
		}
	}
	public static void precioBoleto( String fila) {
		if(fila.equals("A") || fila.equals( "B")) {
			System.out.println("El boleto tiene un costo de $4000");
		}else if(fila=="C"|| fila == "D"|| fila =="E") {
			System.out.println("El boleto tiene un costo de $5300");
		}else if(fila =="F" || fila =="G" || fila =="H") {
			System.out.println("El boleto tiene un costo de $8800");
		}
	}
	public static String separarCaracter(int entrada2) {
		String entrada;
		System.out.println("Ingrese la silla:");
		entrada  = sc.nextLine();
		
		String [] silla  =entrada.split("&");
		
		return silla [entrada2];
		
	}
	public static String entrada(int casos, String caracteres) {
		casos  =sc.nextInt();
		String [] caracteres1 = new String [casos];
		for(int i=0; i<caracteres1.length; i++ ) {
			caracteres1[i]=sc.nextLine();
		}
		String[] caracteres1 = casos.split();
	}
}

