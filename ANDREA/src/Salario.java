import java.util.Scanner;
import java.text.DecimalFormat;
public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat forma	= new DecimalFormat("####.00");
		
		int numeroEmpleado, horasTrabajadas;
		double cantidadHora;
		double total;
		
		numeroEmpleado = sc.nextInt();
		horasTrabajadas = sc.nextInt();
		cantidadHora = sc.nextDouble();
		
		total=horasTrabajadas*cantidadHora;
		
		System.out.println("NUMBER = "+numeroEmpleado);
		System.out.println("SALARY = U$ "+forma.format(total));
	}

}
