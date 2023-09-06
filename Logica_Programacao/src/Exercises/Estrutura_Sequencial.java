package Exercises;

import java.util.Scanner;

public class Estrutura_Sequencial {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		// Exercise 01 
		System.out.println("Soma de n�meros inteiros");
		
		// 1� input  
		System.out.print("Informe 1� n�mero: ");
		int num1 = input.nextInt();
		// 2� input
		System.out.print("Informe o 2� n�mero: ");
		int num2 = input.nextInt();
		
		//Processing
		int resul1 = num1 + num2;
		
		//Output
		System.out.println("SOMA = " + resul1);
		System.out.println();
		
		//Exercise 02
		System.out.println("�rea do C�rculo");
		
		//Input
		System.out.print("Informe o raio: ");
		double raio = input.nextDouble();
		
		//Processing
		final double PI = 3.14159;
		double result2 = PI * raio * raio;
		
		//Output
		System.out.printf("�rea = %.4f%n ", result2);
		System.out.println();
		
		//Exercise 03
		System.out.println("A diferan�a dos produtos");
		
		//Input
		System.out.print("Informe o 1� n�mero: ");
		int a = input.nextInt();
		System.out.print("Informe o 2� n�mero: ");
		int b = input.nextInt();
		System.out.print("Informe o 3� n�mero: ");
		int c = input.nextInt();
		System.out.print("Informe o 4� n�mero: ");
		int d = input.nextInt();
		
		//Processing 
		int result3 = (a * b) - (c * d);
		
		//Output
		System.out.println("DIFERAN�A = " + result3);
		System.out.println();
		
		//Exercise 04
		System.out.println("Seu Sal�rio");
		
		//Input
		System.out.print("Informe seu n�mero: ");
		int number = input.nextInt();
		System.out.print("Informe quantas horas trabalhadas hoje: ");
		double hour = input.nextDouble();
		System.out.print("Informe seu s�lario por hora trabalhadas: ");
		double salary = input.nextDouble();
		
		//Processing
		double result4 = hour * salary;
		
		//Output
		System.out.printf("NUMBER %d%n", number);
		System.out.printf("SALARY %.2f%n", result4);
		System.out.println();
		
		//Exercise 05
		System.out.println("Pe�as Automotivas");
		
		//Input
		System.out.println("1� PE�A");
		System.out.print("Informe o c�digo: ");
		int code1 = input.nextInt();
		System.out.print("Informe a quantidade de pe�as: ");
		int qtde1 = input.nextInt();
		System.out.print("Informe seu valor unit�rio: ");
		double value1 = input.nextDouble();
		System.out.println();
		
		System.out.println("2� PE�A");
		System.out.print("Informe o c�digo: ");
		int code2 = input.nextInt();
		System.out.print("Informe a quantidade de pe�as: ");
		int qtde2 = input.nextInt();
		System.out.print("Informe seu valor unit�rio: ");
		double value2 = input.nextDouble();
		
		//Processing
		double result5 = (qtde1*value1) + (qtde2*value2);
		
		//Output
		System.out.printf("Valor a pagar: R$ %.2f%n", result5);
		System.out.println();
		
		//Exercise 06
		System.out.println("Vamos calcular! As �reas: ");
		System.out.println("Tri�ngulo | Trap�zio | C�rculo | Quadrado | Ret�ngulo");
		
		//Input
		System.out.print("Informe o 1� n�mero: ");
		double x = input.nextDouble();
		System.out.print("Informe o 2� n�mero: ");
		double y = input.nextDouble();
		System.out.print("Informe o 3� n�mero: ");
		double z = input.nextDouble();
		
		//Processing
		double triangle = x * z/2;
		double circle = PI * z * z;
		double trapeze = (x+y)*z/2;
		double square = Math.pow(y,2);
		double rectangle = x * y;
		
		//Output
		System.out.printf("�rea: Tri�ngulo ... %.3f%n", triangle);
		System.out.printf("�rea: c�rculo ..... %.3f%n", circle);
		System.out.printf("�rea: Trap�zio .... %.3f%n", trapeze);
		System.out.printf("�rea: Quadrado .... %.3f%n", square);
		System.out.printf("�rea: Ret�ngulo ... %.3f%n", rectangle);
	}

}
