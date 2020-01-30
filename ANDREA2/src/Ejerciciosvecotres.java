import java.util.Scanner;

public class Ejerciciosvecotres {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, valor;
		double escalar;
		
		System.out.println("Digite el tamaño del vector");
		n=sc.nextInt();
		double vector[] = new double[n];
		System.out.println("Digite el valor de a: ");
		escalar = sc.nextDouble();
		
		for(int i=0; i<vector.length; i++) {
			System.out.println("Arre ["+i+"]");
			valor = sc.nextInt();
			vector[i]=valor;
		}
		
		for(int i =0; i<vector.length; i++) {
			vector[i]= (vector[i]*escalar);
			System.out.println(vector[i]);
		}
	}

}
