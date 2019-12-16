import java.util.Scanner;

public class Saltos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int repeticiones, casos, alt;
		int saltoalto=0, saltobajo=0 ;
		int n=0;

		
		repeticiones = sc.nextInt();
		while(repeticiones !=0) {
			n++;
			saltoalto=0; saltobajo=0 ;
		casos = sc.nextInt();
		int altura[] = new int [casos];
		for(int i=0; i<altura.length; i++) {
			alt = sc.nextInt();
			altura[i] = alt;
		}
		for(int i=0; i<altura.length-1;i++) {
        	  if(altura[i]<altura[i+1]) {
        		 saltoalto++;
        	  }else if(altura[i]>altura[i+1]) {
        		  saltobajo++;
        	  }
		}
		
		System.out.println("Caso "+n+" : "+saltoalto+" "+saltobajo);
		repeticiones--;
		
	}
 }

}
