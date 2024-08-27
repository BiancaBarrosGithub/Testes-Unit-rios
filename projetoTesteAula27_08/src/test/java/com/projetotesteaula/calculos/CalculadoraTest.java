package com.projetotesteaula.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5 + 5 = 10")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "5 + 5 não gerou o valor 10");
	}
	
	@Test
	@DisplayName(" Teste 50 - 20 = 30")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 50D;
		double valor2 = 20D;
		double esperado = 30D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "50 - 20 não gerou o valor 30");
	}
	
	@Test
	@DisplayName(" Teste 7 * 9 = 63 ")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 7D;
		double valor2 = 9D;
		double esperado = 63D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "7 * 9 não gerou o valor 63");
	}
	
	@Test
	@DisplayName(" Teste 50 / 2 = 25")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 50D;
		double valor2 = 2D;
		double esperado = 25D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado, "50 / 2 não gerou o valor 25");
	}

}
