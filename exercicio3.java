package control;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		double num1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		double num2 = sc.nextInt();
		
		System.out.print("Que operação deseja fazer agora?[+,-,*,/]: ");
		char resposta = sc.next().charAt(0);
		
		switch(resposta) {
		case '+':
			System.out.print("Resultado: " +(num1 + num2));
		break;
		case '-':
			System.out.print("Resultado: " +(num1 - num2));
		break;
		case '*': 
			System.out.print("Resultado: " +(num1 * num2));
		break;
		case '/': 
			if(num2 == 0) {
				System.out.print("Operação inválida!");
				break;
			};
			System.out.print("Resultado: " +(num1 / num2));
		break;
		default: System.out.print("Operação inválida!");	
		};
}
}