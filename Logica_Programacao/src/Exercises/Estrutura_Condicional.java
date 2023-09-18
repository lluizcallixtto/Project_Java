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
		int aux1;
		if (num3%num4 == 0) {
			verificacao = "S�o M�tiplos";
		} else if (num3 < num4){
			aux1 = num3;
			num3 = num4;
			num4 = aux1;
			
			if(num3%num4 == 0) {
				verificacao = "S�o M�tiplos";
			}
			if (num3%num4 != 0) {
				verificacao = "N�o s�o Mult�plos";
			}	
		} else if (num3%num4 != 0) {
			verificacao = "N�o s�o Mult�plos";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 04
		System.out.println("Diferen�a entre Horas");
		
		//Input
		System.out.print("Informe o hor�rio de in�cio: ");
		int horarioInicio = input.nextInt();
		System.out.print("Informe o hor�rio de t�rmmino: ");
		int horarioTermino = input.nextInt();
		
		//Processing
		int result;
		if (horarioInicio > horarioTermino) {
			result = horarioInicio - horarioTermino;
			verificacao = " O jogo durou " + result + "h";
		} else if (horarioInicio < horarioTermino){
			result = horarioInicio - horarioTermino + 24;
			verificacao = "O jogo durou " + result + "h";
		} else {
			verificacao = "O Jogo durou 24 hora(s)";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 05
		System.out.println("Lanchonete");
		System.out.println("C�digo || Especifica��o ||  Pre�o ");
		System.out.println("  1          Hot-Dog       R$ 4,00 ");
		System.out.println("  2          X-Salad       R$ 4,50 ");
		System.out.println("  3          X-Bacon       R$ 5,00 ");
		System.out.println("  4          Toast         R$ 2,00 ");
		System.out.println("  5          Refrigerator  R$ 1,50 \n");
		
		
		//Input
		System.out.print("Informe seu c�digo: ");
		int codigo = input.nextInt();
		
		System.out.print("Informe a quantidade: ");
		int qtde = input.nextInt();
		
		
		//Processing
		double total;
		if (codigo == 1) {
			total = qtde * 4.00;
			verificacao = "Total R$" + total;
		} else if (codigo == 2) {
			total = qtde * 4.50;
			verificacao = "Total R$" + total;
		} else if (codigo == 3) {
			total = qtde * 5.00;
			verificacao = "Total R$" + total;
		} else if (codigo == 4) {
			total = qtde * 2.00;
			verificacao = "Total R$" + total;
		} else if (codigo == 5) {
			total = qtde * 1.50;
			verificacao = "Total R$ " + total;
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 06
		System.out.println("Verifica��o de Intervalo");
		System.out.println("Intervalos: [0,25] | (25,50] | (50,75] | (75,100] \n");
		
		//Input
		System.out.print("Informe um n�mero: ");
		double num6 = input.nextDouble();
		
		System.out.print("Informe outro n�mero: ");
		double num7 = input.nextDouble();
		
		//Processing 
		
		double min, max;

        if (num6 < num7) {
            min = num6;
            max = num7;
        } else {
            min = num7;
            max = num6;
        }
		
		if (num6 >= 0 && num6 <= 25 && num7 >= 0 && num7 <= 25) {
			verificacao = "Intervalo [0, 25]";
		} else if (num6 >= 0 && num6 <= 25 && num7 >= 0 && num7 <= 25 &&
				   num6 > 25 && num6 <= 50 && num7 > 25 && num7 <= 50) {
			verificacao = "Intervalo (25, 50]";
		} else if (num6 >= 0 && num6 <= 25 && num7 >= 0 && num7 <= 25 &&
				   num6 > 25 && num6 <= 50 && num7 > 25 && num7 <= 50 &&
				   num6 > 50 && num6 <= 75 && num7 > 50 && num7 <= 75) {
			verificacao = "Intervalo (50, 75]";
		} else if (num6 >= 0 && num6 <= 25 && num7 >= 0 && num7 <= 25 &&
				   num6 > 25 && num6 <= 50 && num7 > 25 && num7 <= 50 &&
				   num6 > 50 && num6 <= 75 && num7 > 50 && num7 <= 75 &&
				   num6 > 75 && num6 <= 100 && num7 > 75 && num7 <= 100) {
			verificacao = "Intervalo (75, 100]";
		} else {
			verificacao = "Fora de Intervalo"; 
		}
		
	   //Output
		System.out.println(verificacao);
		System.out.println();
			
		
     input.close();
	}

}
