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
			
			System.out.print("\nDigite um n�mero (Eixo X): ");
			eixoX = input.nextDouble();

			System.out.print("Digite um n�mero (Eixo Y): ");
			eixoY = input.nextDouble();
		}
		
		//Exercise 03 
		System.out.println("\nPosto de Gasolina");
		System.out.println("C�digo || Combust�vel  ");
		System.out.println("  1          �cool     ");
		System.out.println("  2          Gasolina  ");
		System.out.println("  3          Diesel    ");
		System.out.println("  4          FIM       ");
		
		//Input
		System.out.print("\nDigite seu tipo de combust�vel: ");
		int codigo = input.nextInt();
		
		//Processing
		int alcool = 0;   
		int gasolina = 0; 
		int diesel = 0;   
		
		while (codigo != 4) {
			if (codigo == 1) {
				alcool = alcool + 1; 
			} else if (codigo == 2) {
				gasolina = gasolina + 1;
			} else if (codigo == 3) {
				diesel = diesel + 1;
			}
			System.out.print("\nDigite seu tipo de combust�vel: ");
			codigo = input.nextInt();
		}
		
		//Output
		System.out.println("\nMUITO OBRIGADO!");
		System.out.println("�cool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		// Exercise 04 
		System.out.println("\nVamos calcular todos os n�meros inteiros �mpares");
		
		//Input 
		System.out.print("Digite um n�mero: ");
		int x = input.nextInt();
		
		//Processing&Output
		for (int i = 1; i < x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		//Exercise 05
		System.out.println("\nVamos verificar quantos n�meros est�o nesse intervalo [10,20]");
		
		//Input
		System.out.print("Digite a quantidade de n�meros no intervalo: ");
		int n = input.nextInt();
		
		//Processing
		int in = 0;
		int out = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.print("\nDigite um n�mero: ");
			int y = input.nextInt();
			if(y <= 10 && y <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println("");
		System.out.println(in + " in");
		System.out.println(out + " out");

		input.close();
	}

}
