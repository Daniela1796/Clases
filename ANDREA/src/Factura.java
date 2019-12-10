import java.util.Scanner;

public class Factura {
	static Scanner sc  = new Scanner (System.in);
	public static void main(String[] args) {
		
		int cantidadArticulos, totalNeto = 0,descuento, total = 0, totalConIva = 0, iva = 0;
		int opcion;
		int sumaNeto=0, sumaIva=0, sumaTotal=0;
		String n;
		String nit;
		
		do {
			System.out.println("1. Factura Cliente");
			System.out.println("2. Factura de compras");
			System.out.println("3. Salir");
			System.out.println();
			System.out.println("Digite la opción");
			opcion =  Integer.parseInt(sc.nextLine());
			
			
			
			switch(opcion) {
			case 1: 
				System.out.println("Ingrese la cantidad de artículos: ");
				cantidadArticulos = Integer.parseInt(sc.nextLine());
				
				if(cantidadArticulos !=0) {
				if(cantidadArticulos<=5) {
					total = cantidadArticulos*2000;
					totalNeto = total;
					iva = (int) (total*0.19);
					totalConIva = total+iva;
				}else if (cantidadArticulos<50) {
					totalNeto = cantidadArticulos*2000;
					
					descuento = (int) (totalNeto*0.05);
					total = totalNeto-descuento;
					iva = (int) (total*0.19);
					totalConIva = total+iva;
				}else if(cantidadArticulos>=50) {
					totalNeto=cantidadArticulos*2000;
					descuento = (int) (totalNeto*0.10);
					total = totalNeto-descuento;
					iva = (int) (total*0.19);
					totalConIva = total+iva;
				}
				sumaNeto=sumaNeto+total;
				 sumaIva = sumaIva+iva;
				 sumaTotal = sumaTotal+totalConIva;
			}else {
				System.out.println("Error");
			}
				
				System.out.println("Imprimir Factura");
				System.out.println("Digite el nombre: ");
				n = sc.nextLine();
				System.out.println("Digite el NIT");
				nit = sc.nextLine();
			 imprimirFacturaCliente(n, nit,total,iva,totalConIva);
			break;
			case 2: 
			 Contabilidad(sumaNeto, sumaIva, sumaTotal);
				
				
			case 3: 
				System.exit(0);
				
				default:
					System.out.println("Ingrese una opción válida");
					
					break;
			}
		}while(opcion != 3);
	}
public static void imprimirFacturaCliente (String n2, String nit,int total, int iva, int totalConIva) {
	
	System.out.print("Nombre: "+n2);
	System.out.println();
	System.out.print("Nit: "+nit);
	System.out.println();
	System.out.println("Valor : "+total);
	System.out.println();
	System.out.println("Valor con Iva : "+iva);
	System.out.println();
	System.out.println("Total : "+totalConIva);

}
public static void Contabilidad (int totalNeto, int totalIva,  int total) {
	System.out.println("Valor Neto: "+totalNeto);
	System.out.println();
	System.out.println("Valor Iva"+totalIva);
	System.out.println();
	System.out.println("Total: "+total);
}
}
