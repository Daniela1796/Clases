import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		do {
		System.out.println("Menu de opciones");
		System.out.println("1. Numeros");
		System.out.println("2.Vocales y consonantes");
		System.out.println("3.Calcular área");
		System.out.println("4. Salir");
		System.out.println();
		System.out.println("Digite el número de la opción");
		opcion = Integer.parseInt(sc.nextLine());
		
		switch(opcion) {
		case 1:
			double n;

			System.out.println("Digite un número");
			n=sc.nextDouble();
			signo(n);
			magnitud(n);
			
			break;
		case 2: 
			String letra;
			
			System.out.println("Ingrese una letra");
			letra = sc.nextLine();
			comprobar(letra);
			
		 break;
		 
		case 3: 
			double r1, r2;
			double base, altura;
			double base1, altura2;
			double sumaCirculo;
			double sumaRectangulos;
			double areaTotal;
			
			System.out.println("Ingrese el radio del primer circulo:");
			r1= Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese el radio del segundo circulo");
			r2 = Double.parseDouble(sc.nextLine());
			sumaCirculo=areaCirculo(r1)+areaCirculo(r2);
			System.out.println("Ingrese la base del primer rectangulo");
			base= Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese la altura del primer rectangulo");
			altura=Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese la base del segundo rectangulo");
			base1 =Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese la altura del segundo rectangulo");
			altura2 =Double.parseDouble(sc.nextLine());
			sumaRectangulos = areaRectangulo(base,altura)+areaRectangulo(base1,altura2);
			areaTotal=sumaCirculo+sumaRectangulos;
			System.out.println("El área total es: "+areaTotal);
			
			break;
		case 4:
			System.exit(0);
			
			break;
			
		default:
			System.out.println("Ingrese una opción válida");
			
		}
		}while(opcion!=4);
	}
	public static void signo(double n) {
		if(n!=0) {
		if(n<0) {
			System.out.println("El número es negativo");
		}else {
			System.out.println("El número es positivo");
		}
		}else {
			System.out.println("El número es 0");
		}
	}
	public static void magnitud(double n) {
		double absoluto =Math.abs(n);
		if(absoluto<= 1) {
			System.out.println("EL número es pequeño");
		}else {
			System.out.println("");
		}
		if(absoluto>=1000000) {
			System.out.println("El número es grande");
		}else {
			System.out.println("");
		}
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
	public static double areaCirculo(double r) {
		 double area;
		 area=Math.PI*r*r;
		 return area;
	}
	public static double areaRectangulo(double base, double altura) {
		double area;
		area=base*altura;
		return area;
	}

}
