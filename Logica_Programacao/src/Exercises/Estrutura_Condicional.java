package Exercises;

import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String verificacao;
		
		//Exercise 01 
		System.out.println("Verifica��o: N�mero Negativo");
		
		//Input
		System.out.print("Digite um n�mero: ");
		int num1 = input.nextInt();
		
		//Processing
		if (num1 > 0) {
			verificacao = "N�o Negativo";
		} else if (num1 < 0) {
			verificacao = "Negativo";
		} else {
			verificacao = "Nulo";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 02
		System.out.println("Verifica��o: N�mero Par ou �mpar");
		
		//Input
		System.out.print("Digite um n�mero: ");
		int num2 = input.nextInt();
		
		//Processing
		if (num2%2 == 0) {
			verificacao = "Par";
		} else {
			verificacao = "�mpar";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 03
		System.out.println("Verifica��o: N�meros s�o M�ltiplos");
		
		//Input
		System.out.print("Digite um n�mero: ");
		int num3 = input.nextInt();
		System.out.print("Digite um n�mero: ");
		int num4 = input.nextInt();
		
		//Processing
		int aux;
		if (num3%num4 == 0) {
			verificacao = "S�o M�tiplos";
		} else if (num3 < num4){
			aux = num3;
			num3 = num4;
			num4 = aux;
			
			if(num3%num4 == 0) {
				verificacao = "S�o M�tiplos";
			}
		} else {
			verificacao = "N�o s�o M�tiplos";
		}
		
		//Output
		System.out.println(verificacao);
		
     input.close();
	}

}
