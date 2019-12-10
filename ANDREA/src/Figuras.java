import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numeroLineas;
		int resta;
		char caracter= '*';
		int contador=1;
		
		System.out.println("Digite el número de líneas");
		numeroLineas= sc.nextInt();
		
		for(int i=0; i<numeroLineas; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0; i<numeroLineas; i++) {
			for(int j=0; j<numeroLineas;j++) {
				resta=i-1;
				if(j>resta) {
					System.out.print(caracter);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<numeroLineas; i++) {
			for (int j=0; j<numeroLineas; j++){
				if(j<numeroLineas-i-1) {
					System.out.print(" ");
				}else {
					System.out.print(caracter);
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<numeroLineas; i++){
			for(int j=0; j<2*numeroLineas; j++) {
				if(j<numeroLineas-i-1 || j>=numeroLineas+i) {
					System.out.print(" ");
				   }else {
				System.out.print(caracter);
				   }
		}
			System.out.println();
	}
		System.out.println();
		for(int i=0; i<numeroLineas; i++){
			for(int j=0; j<2*numeroLineas; j++) {
				if(j<numeroLineas-i-1 || j>=numeroLineas+i) {
					System.out.print(" ");
				   }else {
					   System.out.print(i+1);
					   }
				   }
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println();
		for(int i=0; i<numeroLineas; i++){
		
			for(int j=0; j<2*numeroLineas; j++) {
				if(j<numeroLineas-i-1 || j>=numeroLineas+i) {
					System.out.print(" ");
				} else if(j<numeroLineas-1) {
						   System.out.print(contador);
						   contador--;
					   }else {
						   System.out.print(contador);
						   contador++;
					   }
				   }
			System.out.println();
		}
		
		
	}

}
