import java.util.Scanner;

public class Minimo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	int tama�o;
	double menor;
	
	System.out.println("Tama�o del arreglo: ");
	tama�o = sc.nextInt();
	
	double arreglo [] = new double [tama�o];
	
	for(int i=0; i<arreglo.length; i++) {
		System.out.println("valor en ["+i+"] :");
		arreglo[i] = sc.nextDouble();
	}
	
	menor=arreglo[0];
	for(int i=0; i<arreglo.length; i++) {
		if (arreglo[i]<menor) {
			menor =arreglo[i];
		}
	
	}
	System.out.println("El m�nimo valor del arreglo dado es: "+menor);
	}

}
