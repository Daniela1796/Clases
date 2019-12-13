
public class Epsilon {

	public static void main(String[] args) {
		
		
	double suma=1+1, antecesor, potencia;
	int exponente=0;
	
	do {
		antecesor=suma;
		exponente++;
	potencia=1/pot(2,exponente);
	//System.out.println(potencia);
	suma=1+potencia;
	
	System.out.println(potencia);
	
	}while(antecesor !=suma);
	
	System.out.println();
	}
 public static double pot(int n, int exp) {
	 int res=1;
	 
	 for (int i=0; i<exp; i++) {
		 res=res*n;
	 }
	 return res;
 }
}
