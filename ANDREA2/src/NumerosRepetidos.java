
public class NumerosRepetidos {

	public static void main(String[] args) {
		int [] vector = {3,5,5,5,3,2,1,7};
		int [] repetidos = new int [8];
		
		for(int i=0; i<vector.length; i++) {
			for(int j = 0; j<repetidos.length;j++) {
				if(i == vector[j]) {
					repetidos[i]=repetidos[i]+1;
				}
			}
		}
		
		imprimirArreglo(repetidos);
		
		for(int j=0; j<vector.length; j++) {
			for(int k=0; k<vector.length; k++) {
				if(vector[j]==vector[k]) {
					repetidos[j]++;
				}
				
			}
			System.out.println(vector[j]+" "+repetidos[j]);
			System.out.println(vector[j]);
			}
		}
	public static void imprimirArreglo(int[] arreglo) {
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		System.out.println();
	}
	}


