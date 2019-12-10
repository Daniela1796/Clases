import java.util.Scanner;

public class Circulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		double radio;
		double centrox= 5;
		double centroy = 5;
		double distancia, distanciatotal;
		double operacion, operacion1;
		
		System.out.println("Radio: ");
		radio= sc.nextInt();
		
	
			for(int i=0;i<2*centrox ;i++) {
				for(int j=0; j<2*centroy; j++) {
					operacion=i-centrox;
					operacion1 = j-centroy;
					distancia=operacion*operacion+operacion1*operacion1;
					distanciatotal= Math.sqrt(distancia);
					if(distanciatotal<radio+0.5 && distanciatotal>radio-0.5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
				
			}
		}
}
