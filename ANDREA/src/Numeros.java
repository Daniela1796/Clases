import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		int n;
		int numero;
		System.out.println("Digite un número");
		n=sc.nextInt();
		numero=Math.abs(n);

	}
	public static void signo(int n) {
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
	public static void magnitud(int n) {
		while(n<0) {
			if(n<0 && n<) {
				System.out.println("El número es negat y pequeño");
			}
		}
		}
	}
}
