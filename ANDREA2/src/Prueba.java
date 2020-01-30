import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese una letra");
		String a=sc.nextLine();
		
		switch(a) {
		case "A":
			System.out.println("1");
		break;
		case"B":
			System.out.println("2");
			
		case "C":
			System.out.println("3");
			break;
		default:
			System.out.println("5");
		}
	}

}
