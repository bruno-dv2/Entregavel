package entregavel1;

import java.util.Scanner;

public class somatorio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números:");
		int soma = sc.nextInt();
		int num, cont = 0;
		
		for(int i = 0; i < soma; i++) {
			System.out.println("Entre com um número: ");
			num = sc.nextInt();
			cont += num;
		}
		System.out.println("A soma é: " + cont);
		
		sc.close();
	}
}
