import java.util.Scanner;

public class parcial2 {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		int opcion;
		do {
			System.out.println("1. Sumatoria");
			System.out.println("2. Logaritmo");
			System.out.println("3. Sobrepeso");
			System.out.println("4. Figura");
			System.out.println("5. Salir");
			System.out.println();
			System.out.println("Opción: ");
			opcion= sc.nextInt();
			
			switch(opcion) {
			case 1:
			    double n=0;
			    sumatoria(n);
			    break;
			case 2: 
				double x=0;
				logaritmo(x);
				
				break;
				
			case 3: 
				double alt=0, peso=0;
				estadistica(5,alt,peso);
				break;
				
			case 4: 
				int lineas=0;
				figura(lineas);
			}
		}while(opcion !=5);
	}
	public static void sumatoria(double n) {
		System.out.println("Digite n: ");
		n=sc.nextDouble();
		double suma=0;
		for (double i=1; i<=n;i++ ) {
			suma=suma+((i-10/2*i));
		}
		System.out.println("La sumatoria desde 1 hasta"+n+" es : "+suma);
	}
	public static void logaritmo(double n){
		double frac, suma=0;
		System.out.println("Digite n: ");
		n =sc.nextInt();
		for(int i=1; i<=n; i++) {
			frac=1/i;
			suma=suma+frac;
		}
		System.out.println("La aproximación del logaritmo de 2 hasta "+n+" es:"+suma);
		
	}
	public static void estadistica(double n,double alt, double peso) {
		double imc, den;
		int bajo=0, normal=0, sobrepeso=0, obesidad=0;
		for(int i=0; i<n; i++) {
			for (int j=0;j<i;j++) {
				System.out.println("Altura del paciente "+i+" : ");
				alt = sc.nextDouble();
				System.out.println("Peso del paciente "+j+" : ");
				peso = sc.nextDouble();
			}
			
			}
		
		System.out.println("Bajo Peso: "+bajo);
		System.out.println("Peso normal: "+normal);
		System.out.println("Sobrepeso: "+sobrepeso);
		System.out.println("Obesidad: "+obesidad);
	}

	public static void figura(int n) {
		System.out.println("Digite las lineas: ");
		n =sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*n; j++) {
				if(i==j || i+j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
