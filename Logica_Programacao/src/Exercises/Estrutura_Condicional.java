package Exercises;

import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String verificacao;
		
		//Exercise 01 
		System.out.println("Verificação: Número Negativo");
		
		//Input
		System.out.print("Digite um número: ");
		int num1 = input.nextInt();
		
		//Processing
		if (num1 > 0) {
			verificacao = "Não Negativo";
		} else if (num1 < 0) {
			verificacao = "Negativo";
		} else {
			verificacao = "Nulo";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 02
		System.out.println("Verificação: Número Par ou Ímpar");
		
		//Input
		System.out.print("Digite um número: ");
		int num2 = input.nextInt();
		
		//Processing
		if (num2%2 == 0) {
			verificacao = "Par";
		} else {
			verificacao = "Ímpar";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 03
		System.out.println("Verificação: Números são Múltiplos");
		
		//Input
		System.out.print("Digite um número: ");
		int num3 = input.nextInt();
		System.out.print("Digite um número: ");
		int num4 = input.nextInt();
		
		//Processing
		int aux;
		if (num3%num4 == 0) {
			verificacao = "São Mútiplos";
		} else if (num3 < num4){
			aux = num3;
			num3 = num4;
			num4 = aux;
			
			if(num3%num4 == 0) {
				verificacao = "São Mútiplos";
			}
		} else {
			verificacao = "Não são Mítiplos";
		}
		
		//Output
		System.out.println(verificacao);
		
     input.close();
	}

}
