package control;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.print("O numero é par!");
		}else
			System.out.print("O numero é impar!");
	}
}