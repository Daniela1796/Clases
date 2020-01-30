import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		double n;

		System.out.println("Digite un número");
		n=sc.nextDouble();
		signo(n);
		magnitud(n);
		
		

	}
	public static void signo(double n) {
		if(n!=0) {
		if(n<0) {
			System.out.println("El número es negativo");
		}else {
			System.out.println("El número es positivo");
		}
		}else {
			System.out.println("El número es 0");
		}
	}
	public static void magnitud(double n) {
		double absoluto =Math.abs(n);
		if(absoluto<= 1) {
			System.out.println("EL número es pequeño");
		}else {
			System.out.println("");
		}
		if(absoluto>=1000000) {
			System.out.println("El número es grande");
		}else {
			System.out.println("");
		}
	}
	
	}
	

