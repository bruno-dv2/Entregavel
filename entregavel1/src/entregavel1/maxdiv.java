package entregavel1;

import java.util.Scanner;

public class maxdiv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = sc.nextInt();
		System.out.println("Digite o vaor de b: ");
		int b = sc.nextInt();
		int resto;
		
		while(b != 0) {
			resto = a % b;
			a = b;
			b = resto;
		}
		System.out.println(a);
		
		
		sc.close();
	}

}
