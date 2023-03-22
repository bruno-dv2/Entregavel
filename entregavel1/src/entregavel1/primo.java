package entregavel1;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0, cont = 0;
		
		System.out.println("Digite um número: ");
		
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cont++;
			}
		}
		
		if(cont == 2) {
			System.out.println(num + " é primo");
		}else {
			System.out.println(num + " não é primo");
		}
		
		sc.close();
		}
	}

