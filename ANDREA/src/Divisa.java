import java.util.Scanner;

public class Divisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos;
		int n, m;
		int x, y;
		casos = sc.nextInt();
		while (casos != 0) {
			m = sc.nextInt();
			n = sc.nextInt();
			for (int i = 0; i < casos; i++) {
				
				x = sc.nextInt();
				y = sc.nextInt();
				if (x > m && y > n) {
					System.out.println("NE");
				} else if (x < m && y > n) {
					System.out.println("NO");
				} else if (x > m && y < n) {
					System.out.println("SE");
				} else if (x < m && y < n) {
					System.out.println("SO");
				} else if (x == m || y == n) {
					System.out.println("Divisa");
				}
			}
			casos =sc.nextInt();

		}
	}

}
