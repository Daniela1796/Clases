import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		double n;

		System.out.println("Digite un n�mero");
		n=sc.nextDouble();
		signo(n);
		magnitud(n);
		
		

	}
	public static void signo(double n) {
		if(n!=0) {
		if(n<0) {
			System.out.println("El n�mero es negativo");
		}else {
			System.out.println("El n�mero es positivo");
		}
		}else {
			System.out.println("El n�mero es 0");
		}
	}
	public static void magnitud(double n) {
		double absoluto =Math.abs(n);
		if(absoluto<= 1) {
			System.out.println("EL n�mero es peque�o");
		}else {
			System.out.println("");
		}
		if(absoluto>=1000000) {
			System.out.println("El n�mero es grande");
		}else {
			System.out.println("");
		}
	}
	
	}
	

