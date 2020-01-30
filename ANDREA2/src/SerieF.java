import java.util.Scanner;

public class SerieF {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner (System.in);
		int n;
		
		n=sc.nextInt();
		System.out.println(fibonacci(n));
	}
	public static int fibonacci (int n) {
		int resultado;
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
		resultado = fibonacci(n-1)+fibonacci(n-2);
		}
		System.out.println(resultado);
		return resultado;
	}
}
