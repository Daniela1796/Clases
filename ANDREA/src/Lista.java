import java.util.Scanner;

public class Lista {

	public static void main(String args[]) {
		Scanner sc =  new Scanner (System.in);
		
		String[] lista = new String [10];
		String nombre;
		for(int i=0; i<lista.length; i++) {
			System.out.println((i+1)+" Nombre: ");
			nombre = sc.nextLine();
			lista[i]=nombre;
		}
		imprimirArregloString(lista);
		
	}
	public static void imprimirArregloString(String[] arreglo) {
		for(int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
