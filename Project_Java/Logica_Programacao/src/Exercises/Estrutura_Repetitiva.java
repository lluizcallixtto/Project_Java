package Exercises;

import java.util.Scanner;

public class Estrutura_Repetitiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String verificacao;

		// Exercise 01
		System.out.println("Acesse o sistema");

		// Input
		System.out.print("Senha: ");
		int senha = input.nextInt();

		// Processing
		while (senha != 2002) {
			System.out.println("Senha Inválida!");
			System.out.print("\nSenha: ");
			senha = input.nextInt();
		}

		verificacao = "Acesso liberado!";

		// Output
		System.out.println(verificacao);
		System.out.println();

		// Exercise 02
		System.out.println("Plano Cartesiano | Quadrantes");

		// Input
		System.out.print("Digite um número (Eixo X): ");
		double eixoX = input.nextDouble();

		System.out.print("Digite um número (Eixo Y): ");
		double eixoY = input.nextDouble();

		//Processing&Output
		while (eixoX != 0 && eixoY != 0) {
			if (eixoX > 0 && eixoY > 0) {
				verificacao = "Q1";
			} else if (eixoX < 0 && eixoY > 0) {
				verificacao = "Q2";
			} else if (eixoX < 0 && eixoY < 0) {
				verificacao = "Q3";
			} else if (eixoX > 0 && eixoY < 0) {
				verificacao = "Q4";
			}
			System.out.println(verificacao);
			System.out.println();
			
			System.out.print("\nDigite um número (Eixo X): ");
			eixoX = input.nextDouble();

			System.out.print("Digite um número (Eixo Y): ");
			eixoY = input.nextDouble();
		}
		

		input.close();
	}

}
