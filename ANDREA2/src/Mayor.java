import java.util.Scanner;

public class Mayor {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int n, o;
		System.out.println("Digite un número: ");
		n=sc.nextInt();
		System.out.println("Digite un número: ");
		o=sc.nextInt();
		numeros(n,o);
		
		
	}
	public static void numeros(int x, int y) {
		int min=minimo(x,y);
		int max=maximo(x,y);
		for(int i=min; i<=max;i++) {
			System.out.println(i);
		}
	}
	public static int minimo(int x, int y) {
		int min = 0;
		if(x>y) {
			min=y;
		}else {
			min=x;
		}
		return min;
	}
	public static int maximo(int x, int y) {
		int max=0;
		if(x>y) {
			max=x;
		}else {
			max=y;
		}
		return max;
	}
}
