

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String y = "Hola";
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite un número");
		n=sc.nextInt();
		double suma=0;
		double fact=1;
		int i=1;
		int j =1;
		double x =  (Math.PI/2);
		int signo=-1;
		double operacion =1.0;
		
		while(i<=n) {
			if(i%2 !=0) {
				while(j<=i) {
					fact=fact*j;
					j++;
				}
				signo=signo*(-1);
				operacion=Math.pow(x,i)/fact*signo;
				suma =suma+operacion;
			}
			i++;
		}
		System.out.print("El seno de pi/2 es: "+suma+y+"\n");
		System.out.print("Saludo");
	}

}
