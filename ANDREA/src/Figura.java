import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double r1, r2;
		double base, altura;
		double base1, altura2;
		double sumaCirculo;
		double sumaRectangulos;
		double areaTotal;
		
		System.out.println("Ingrese el radio del primer circulo:");
		r1= sc.nextDouble();
		System.out.println("Ingrese el radio del segundo circulo");
		r2 = sc.nextDouble();
		sumaCirculo=areaCirculo(r1)+areaCirculo(r2);
		System.out.println("Ingrese la base del primer rectangulo");
		base= sc.nextDouble();
		System.out.println("Ingrese la altura del primer rectangulo");
		altura=sc.nextDouble();
		System.out.println("Ingrese la base del segundo rectangulo");
		base1 = sc.nextDouble();
		System.out.println("Ingrese la altura del segundo rectangulo");
		altura2 = sc.nextDouble();
		sumaRectangulos = areaRectangulo(base,altura)+areaRectangulo(base1,altura2);
		areaTotal=sumaCirculo+sumaRectangulos;
		System.out.println("El area total es: "+areaTotal);
		
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
