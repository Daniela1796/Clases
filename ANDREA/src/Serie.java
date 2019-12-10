import java.util.Scanner;

public class Serie {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		long suma=0;
		long antecesor=1;
		long anteantecesor=0;
		System.out.println("Número:");
		n = sc.nextInt();
		
		System.out.println(anteantecesor);
		System.out.println(antecesor);
			for(int i=1;i<n;i++) {
				suma= anteantecesor+antecesor;
				System.out.println(suma);
				anteantecesor = antecesor;
				antecesor=suma;
			}
	}

}
