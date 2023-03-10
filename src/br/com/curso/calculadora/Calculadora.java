package br.com.curso.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b;

			System.out.println("Informe o primeiro numero:");
			a = scan.nextInt();
			System.out.println("Informe o segundo numero:");
			b = scan.nextInt();
			
			int soma = soma(a, b);
			int subtracao = subtracao(a, b);
			double divisao = divisao(a, b);
			int multiplicacao = multiplicacao(a, b);
			
			System.out.println("Soma: " + soma);
			System.out.println("Subtração: " + subtracao);
			System.out.println("Divisão: " + String.format("%,.3f", divisao));
			System.out.println("Multiplicação: " + multiplicacao);
		}
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static double divisao(int a, int b) {
		return Double.valueOf(a) / Double.valueOf(b);
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
