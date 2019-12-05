import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		
		String letra;
		
		System.out.println("Ingrese una letra");
		letra = sc.nextLine();
		comprobar(letra);
	}
    public static void comprobar(String letra ) {
    	char caracter = letra.charAt(0);
    	if(letra.length()==1) {
    		if(caracter =='a'||caracter=='A' || caracter =='e' || caracter=='E' || caracter=='i'|| caracter =='I'|| caracter=='o'|| caracter=='O' || caracter=='u'|| caracter =='U' ) {
    			System.out.println("Vocal");
    		}else {
    			System.out.println("Consonante");
    		}
    	}else {
    		System.out.println("Error");
    	}
    }
}
