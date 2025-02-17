package Exercises;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Repetitiva {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
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
		
		//Exercise 03 
		System.out.println("\nPosto de Gasolina");
		System.out.println("Código || Combustível  ");
		System.out.println("  1          Álcool    ");
		System.out.println("  2          Gasolina  ");
		System.out.println("  3          Diesel    ");
		System.out.println("  4          FIM       ");
		
		//Input
		System.out.print("\nDigite seu tipo de combustível: ");
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
			System.out.print("\nDigite seu tipo de combustível: ");
			codigo = input.nextInt();
		}
		
		//Output
		System.out.println("\nMUITO OBRIGADO!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		// Exercise 04 
		System.out.println("\nVamos calcular todos os números inteiros Ímpares");
		
		//Input 
		System.out.print("Digite um número: ");
		int x = input.nextInt();
		
		//Processing&Output
		for (int i = 1; i < x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		//Exercise 05
		System.out.println("\nVamos verificar quantos números estão nesse intervalo [10,20]");
		
		//Input
		System.out.print("Digite a quantos números você quer analisar: ");
		int n = input.nextInt();
		
		//Processing
		int in = 0;
		int out = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.print("\nDigite um número: ");
			int y = input.nextInt();
			if(y >= 10 && y <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println("");
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		//Exercise 06
		System.out.println("Vamos fazer a média ponderada de três valores com pesos 2, 3 e 5, respectivamente ");
		
		//Input
		System.out.print("Digite a quantidade de médias a serem analisadas: ");
		int qtdeMedias = input.nextInt();
		System.out.println("");
		
		//Processing&Output
		for (int i = 0; i < qtdeMedias; i++) {
			double somaPesos = 2.0 + 3.0 + 5.0; 
			double somaNotasPonderadas = 0;
			
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite a "+ (j + 1) +"° nota: ");
				double nota = input.nextDouble();
				
				if (j == 0) {
					somaNotasPonderadas += nota * 2.0;
				} else if (j == 1) {
					somaNotasPonderadas += nota * 3.0;
				} else {
					somaNotasPonderadas += nota * 5.0;
				}
			}
			
			double mediaPonderada = somaNotasPonderadas / somaPesos;
			verificacao = String.format("\nSua média foi %.1f \n", mediaPonderada);
			
			System.out.println(verificacao);
		}
		
		// Exercise 07 
		System.out.println("Vamos fazer divisões");
		
		//Input 
		System.out.print("Digite quantas divisões você quer fazer: ");
		int qtdeDivisoes = input.nextInt();
		
		//Processing&Output
		for (int i = 0; i < qtdeDivisoes; i++) {
			System.out.print("Digite um número: ");
			double numerador = input.nextDouble();
			System.out.print("Digite um número: ");
			double denominador = input.nextDouble();
			
			if (denominador == 0) {
				verificacao = "Divisão Ímpossivel!";
			} else {
				double divisor = numerador / denominador ;
				verificacao = String.format("%.1f", divisor);
			}
			
			System.out.println();
			System.out.println(verificacao);
		}
		
		//Exercise 08
		System.out.println("Calculadora de fatorial");
		
		//Input
		System.out.print("Digite um número: ");
		int numb = input.nextInt();
		
		//Processing
		int fat = 1;
		if (numb == 0) {
			numb = 1;
			verificacao = String.format("Fatorial de 0 é sempre ", numb);
		} else {
			for (int i = 1; i <= numb; i++) {
				fat = fat * i;
			}
			verificacao = String.format("O fatorial de %d! = %d%n ", numb, fat);
		}
		
		System.out.println();
		System.out.println(verificacao);
		
		//Exercise 09 
		System.out.println("Vamos verificar seus divisores");
		
		//Input 
		System.out.print("Digite um número: ");
		int number = input.nextInt();
		
		//Processing
		for (int i = 1; i <= number; i++) {
			if (number%i == 0) {
				System.out.println(i);
			}
		}
		
		//Exercise 10 
		System.out.println("Vamos calcular!");
		
		//input 
		System.out.print("Digite um número: ");
		int numbe = input.nextInt();
		
		//Processing
		for (int i = 0; i <= numbe; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d%n ", primeiro, segundo, terceiro);
		}
		
		//Exercise - Example 
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = input.nextDouble();
			double F = 9.0 * C / 5.00 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n ", F);
			System.out.print("Deseja continuar: ");
			resp = input.next().charAt(0); 
		} while(resp != n);
		 	
		
		input.close();
	}

}
