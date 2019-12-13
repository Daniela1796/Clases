import java.util.Scanner;

public class Criba {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamaño, primos = 0;
		
		System.out.println("Tamaño:");
		tamaño = sc.nextInt();
		
		int [] marcar = new int[tamaño];
		int numeros[] = new int [tamaño];
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = i+1;
			System.out.print(numeros[i]);
		}
		System.out.println();
		marcar[0]=1;
		for(int i=1;i<numeros.length; i++) {
			System.out.println(marcar[i]+" "+numeros[i]);
		 if(marcar[i]==0) {
				for(int j=i+1; j<numeros.length; j++) {
				if(marcar[j]!=1) {
					if(numeros[j]%numeros[i]==0) {
						marcar[j]=1;
					}
				 }
			   }
			}
		}
		
		System.out.println();
		for(int i=0; i<marcar.length; i++) {
			if(marcar[i]==0) {
				System.out.print(numeros[i]+" ");
			}
		}
		
	}

}
