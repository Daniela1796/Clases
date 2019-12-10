import java.util.Scanner;

public class Conversor {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		int binario, digito;
		int decimal = 0, i = 0;
		
		System.out.println("Número binario:");
		binario = sc.nextInt();
		
		while(binario>=1) {
			
			digito=binario%10;
			decimal = (int) (decimal+digito*Math.pow(2,i));
			i++;
			binario = binario/10;
			}
		System.out.println(decimal);
		}
		
	}


