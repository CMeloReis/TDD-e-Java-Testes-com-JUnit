package br.com.alura.tdd.Calculadora;

public class CalculadoraTestesMain {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(3, 7);
		System.out.println(soma);
		
		soma = calc.somar(3, 0);
		System.out.println(soma);
		
		soma = calc.somar(0, 0); 
		System.out.println(soma);
		
		soma = calc.somar(3, -1); 
		System.out.println(soma);
		
		soma = calc.somar(-2, -3); 
		System.out.println(soma);
		 
		

	}

}
