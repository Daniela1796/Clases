import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n; 
		int eleva;
		
		System.out.println("Número");
		n=sc.nextInt();
		
		
			for(int i=0; i<=n; i++) {
				eleva = potencia(i,2);
				System.out.println((i)+"  ->"+"  "+eleva);
			
			}

		

}
	
	public static int potencia(int n, int pot) {
		int res=1;
		for(int i=1; i<=pot; i++) {
			res=res*n;
		}
		return res;
	}
}
