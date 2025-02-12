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
		int aux1;
		if (num3%num4 == 0) {
			verificacao = "São Mútiplos";
		} else if (num3 < num4){
			aux1 = num3;
			num3 = num4;
			num4 = aux1;
			
			if(num3%num4 == 0) {
				verificacao = "São Mútiplos";
			}
			if (num3%num4 != 0) {
				verificacao = "Não são Múltiplos";
			}	
		} else if (num3%num4 != 0) {
			verificacao = "Não são Múltiplos";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 04
		System.out.println("Diferença entre Horas");
		
		//Input
		System.out.print("Informe o horário de início: ");
		int horarioInicio = input.nextInt();
		System.out.print("Informe o horário de término: ");
		int horarioTermino = input.nextInt();
		
		//Processing
		int result;
		if (horarioInicio > horarioTermino) {
			result = horarioInicio - horarioTermino;
			verificacao = " O jogo durou " + result + "h";
		} else if (horarioInicio < horarioTermino){
			result = horarioTermino - horarioInicio;
			verificacao = "O jogo durou " + result + "h";
		} else {
			verificacao = "O Jogo durou 24 hora(s)";
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 05
		System.out.println("Lanchonete");
		System.out.println("Código || Especificação ||  Preço ");
		System.out.println("  1          Hot-Dog       R$ 4,00 ");
		System.out.println("  2          X-Salad       R$ 4,50 ");
		System.out.println("  3          X-Bacon       R$ 5,00 ");
		System.out.println("  4          Toast         R$ 2,00 ");
		System.out.println("  5          Refrigerante  R$ 1,50 \n");
		
		
		//Input
		System.out.print("Informe seu código: ");
		int codigo = input.nextInt();
		
		System.out.print("Informe a quantidade: ");
		int qtde = input.nextInt();
		
		
		//Processing
		double total;
		if (codigo == 1) {
			total = qtde * 4.00;
			verificacao = "Total R$" + total;
		} 
		else if (codigo == 2) {
			total = qtde * 4.50;
			verificacao = "Total R$" + total;
		} 
		else if (codigo == 3) {
			total = qtde * 5.00;
			verificacao = "Total R$" + total;
		} 
		else if (codigo == 4) {
			total = qtde * 2.00;
			verificacao = "Total R$" + total;
		} 
		else if (codigo == 5) {
			total = qtde * 1.50;
			verificacao = "Total R$ " + total;
		}
		
		//Output
		System.out.println(verificacao);
		System.out.println();
		
		//Exercise 06
		System.out.println("Verificação de Intervalo");
		System.out.println("Intervalos: [0,25] | (25,50] | (50,75] | (75,100] \n");
		
		//Input
		System.out.print("Digite um número: ");
		double num6 = input.nextDouble();
		
		
		//Processing 
		if (num6 < 0.00 || num6 > 100.00) { 
			verificacao = "Fora do Intervalo";
		} 
		else if (num6 <= 25.00) {
			verificacao = "Intervalo [0,25]";
		} 
		else if (num6 <= 50.00) {
			verificacao = "Intervalo (25,50]";
		}
		else if (num6 <= 75.00) { 
			verificacao = "Intervalo (50,75]";
		}
		else {
			verificacao = "Intervalo (75,100]";
		}
		
	   //Output
		System.out.println(verificacao);
		verificacao = String.format("%.2f", num6);
		System.out.println(verificacao);
		System.out.println();
	   
	   //Exercise 07
	   System.out.println("Plano Cartesiano | Quadrantes");
	   
	   //input
	   System.out.print("Digite um número (Eixo X): ");
	   double eixoX = input.nextDouble();
	   
	   System.out.print("Digite um número (Eixo Y): ");
	   double eixoY = input.nextDouble();
	   
	   //Processing 
	   if (eixoX == 0 && eixoY == 0) {
		   verificacao = "Origem";
	   }
	   else if (eixoX > 0 && eixoY > 0) {
		   verificacao = "Q1";
	   }
	   else if (eixoX < 0 && eixoY > 0) {
		   verificacao = "Q2";
	   }
	   else if (eixoX < 0 && eixoY < 0) {
		   verificacao = "Q3";
	   }
	   else if (eixoX > 0 && eixoY <0) {
		   verificacao = "Q4";
	   }
	  
	  //Output
	  System.out.println(verificacao);
	  System.out.println();
		
     //Exercise 08
	 System.out.println("Imposto de Renda");
	 
	 //Input
	 System.out.print("Informe seu salário: ");
	 double salario = input.nextDouble();
	 
	 //Processing
	 double imposto;
	 if (salario <= 2000.0) {
		 imposto = 0.0;
	 }
	 else if (salario <= 3000.0) {
		 imposto = (salario - 2000.0) * 0.08;
	 }
	 else if (salario <= 4500.0) {
		 imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
	 }
	 else {
		 imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
	 }
	 
	 if (imposto == 0.0) {
		 verificacao = "Insento"; 
	 }
	 else {
		 verificacao = String.format("%.2f", imposto);
	 }
	 
	 //Output
	 System.out.println(verificacao);
	 System.out.println();
	 
	 //Exercise - Example
	 System.out.println("Empresa CallMe - Consulte seu Plano de acordo com minutos de ligações");
	 System.out.println();
	 
	 //Input
	 System.out.print("Informe quantos minutos utilizados: ");
	 int minutos = input.nextInt();
	 
	 //Processing
	 double conta = 50.0;
	 if (minutos > 100) {
		 conta += (minutos - 100) * 2.0;
	 }
	 verificacao = String.format("Valor da conta = R$ %.2f", conta);
	 
	 //Output
	 System.out.println(verificacao);
	 System.out.println();
	 
	 //Exercise - Example
	 System.out.println("Week Good \n");
	 
	 //Input
	 System.out.print("Digite de 1 a 7 para saber o dia da semana: ");
	 int num7 = input.nextInt();
	 
	 //Processing
	 String dia;
	 switch (num7){
	 case 1: 
		 dia = "Domingo";
		 break;
	 case 2: 
		 dia = "Segunda-feira";
		 break;
	 case 3: 
		 dia = "Terça-feira";
		 break;
	 case 4: 
		 dia = "Quarta-feira";
		 break;
	 case 5: 
		 dia = "Quinta-feira";
		 break;
	 case 6: 
		 dia = "Sexta-feira";
		 break;
	 case 7: 
		 dia = "Sábado";
		 break;
	 default: 
		 dia = "Valor Inválido";
		 break;
	 }
	 verificacao = dia;
	 
	 //Output
	 System.out.println(verificacao);
	 System.out.println();
	 
	 //Exercise - Example 
	 System.out.println("Descontão: produtos custando menos de R$ 20,00 com 10% de desconto \n"
	 		          + "produtos custando mais de R$ 20,00 com 5% de desconto \n");
	 
	 //Input
	 System.out.print("Informe o preço do seu produto: ");
	 double preco = input.nextInt();
	 
	 //Processing
	 double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	 double valorTotal = preco - desconto;
	 verificacao = String.format("Valor Total R$ %.2f", valorTotal);
	 
	 //Output
	 System.out.println(verificacao);
	 System.out.println();
		
     input.close();
	}

}
