import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		int n;
		int numero;
		System.out.println("Digite un n�mero");
		n=sc.nextInt();
		numero=Math.abs(n);

	}
	public static void signo(int n) {
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
	public static void magnitud(int n) {
		while(n<0) {
			if(n<0 && n<) {
				System.out.println("El n�mero es negat y peque�o");
			}
		}
		}
	}
}
