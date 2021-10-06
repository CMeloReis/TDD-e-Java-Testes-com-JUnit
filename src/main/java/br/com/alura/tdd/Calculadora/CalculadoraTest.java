package br.com.alura.tdd.Calculadora;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	
	@Test
	public void deveriaSomarDoisNumeros() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
		
	}

}
