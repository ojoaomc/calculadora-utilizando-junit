package com.example.calculadora.junit;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		double resultadoSoma = calculadora.somar(50, 25);
		
		System.out.println("Resultado soma: "+ resultadoSoma);
		
		double resultadoSubtracao = calculadora.subtrair(50, 25);
		
		System.out.println("Resultado subtração: "+ resultadoSubtracao);

		double resultadoMultiplicacao = calculadora.multiplicar(50, 25);
		
		System.out.println("Resultado multiplicação: "+ resultadoMultiplicacao);
		
		double resultadoDivisao = calculadora.dividir(50, 25);
		
		System.out.println("Resultado divisão: "+ resultadoDivisao);
	}

}
