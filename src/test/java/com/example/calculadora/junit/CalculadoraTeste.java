package com.example.calculadora.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void SomarDoisNumerosComSucesso() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.somar(50, 25);
		
		assertEquals(75, resultado);
	}
	@Test
	public void SubtrairDoisNumerosComSucesso() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.subtrair(50, 25);
		
		assertEquals(25, resultado);
	}
	@Test
	public void MultiplicarDoisNumerosComSucesso() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.multiplicar(50, 25);
		
		assertEquals(1250, resultado);
	}
	@Test
	public void DividirDoisNumerosComSucesso() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.dividir(50, 25);
		
		assertEquals(2, resultado);
	}
}