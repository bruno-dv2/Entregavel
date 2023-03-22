package entregavel1;

import java.util.Scanner;

public class contagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números: ");
		int n = sc.nextInt();
		
		int num, cont = 0, i = 0;
		
		while(i < n) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num >= 0) {
				cont += 1;
			}
			i += 1;
		}
		System.out.println("A quantidade de números inteiros é: " + cont);
		
		sc.close();

	}

}
