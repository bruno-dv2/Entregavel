package entregavel1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int a = 0, b = 1, c, n;
		
		System.out.println("Digite a quantidade de termos: ");
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
		
		sc.close();
	}

}
