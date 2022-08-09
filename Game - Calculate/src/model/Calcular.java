package model;

import java.util.Random;

public class Calcular {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int resultado;
	private int operacao;
	
	
	
	public Calcular(int dificuldade) {
		//gera um valor aleatório;
		Random aleatorio = new Random();
		
		this.operacao = aleatorio.nextInt(3);
		
		this.dificuldade = dificuldade;
		
		//configuração da dificuldade. Quanto maior a dificuldade, maior a faixa de valores possíveis para os cálculos;
		switch(this.dificuldade) {
		case 1:
			//easy
			this.valor1 = aleatorio.nextInt(10);
			this.valor2 = aleatorio.nextInt(10);
			break;
		case 2:
			//normal
			this.valor1 = aleatorio.nextInt(100);
			this.valor2 = aleatorio.nextInt(100);
			break;
		case 3:
			//difícil
			this.valor1 = aleatorio.nextInt(1000);
			this.valor2 = aleatorio.nextInt(1000);
			break;
		case 4:
			//muito difícil
			this.valor1 = aleatorio.nextInt(10000);
			this.valor2 = aleatorio.nextInt(10000);
			break;
		default:
			//hardcore
			this.valor1 = aleatorio.nextInt(1000000);
			this.valor2 = aleatorio.nextInt(1000000);
			break;	
		}
	}

	public int getDificuldade() {
		return dificuldade;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public int getValor2() {
		return valor2;
	}
	
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int getOperacao() {
		return operacao;
	}
	
	public String toString() {
		//método toString(), usado para mostrar e visualizar a classe e os objetos;
		String operacao = "";
		
		if (this.getOperacao() == 0) {
			operacao = "Somar";
		}else if(this.getOperacao() == 1) {
			operacao = "Subtrair";
		}else if(this.getOperacao() == 2) {
			operacao = "Multiplicar";
		}else {
			operacao = "Operação desconhecida.";
		}
		
		return "Valor 1: " + this.getValor1() +
				"\nValor 2: " + this.getValor2() + 
				"\nDificuldade: " + this.getDificuldade() + 
				"\nOperação: " + this.getOperacao();	
	}
	
	/**
	 * Método que realiza a soma.
	 * @param resposta do usuário
	 * @return true se a resposta for correta e false se for incorreta
	 */
	public boolean calcularSomar(int resposta){
		boolean resposta_correta = false;
		
		this.resultado = this.getValor1() + this.getValor2();
		
		if(this.resultado == resposta) {
			resposta_correta = true;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Incorreta!");
		}
		
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());	
		return resposta_correta;
	}
	
	/**
	 * Método que realiza a subtração.
	 * @param resposta do usuário
	 * @return true se a resposta for correta e false se for incorreta
	 */
	public boolean calcularSubtracao(int resposta){
		boolean resposta_correta = false;
		
		this.resultado = this.getValor1() - this.getValor2();
		
		if(this.resultado == resposta) {
			resposta_correta = true;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Incorreta!");
		}
		
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());	
		return resposta_correta;
	}
	
	/**
	 * Método que realiza a multiplicação.
	 * @param resposta do usuário
	 * @return true se a resposta for correta e false se for incorreta
	 */
	public boolean calcularMultiplicacao(int resposta){
		boolean resposta_correta = false;
		
		this.resultado = this.getValor1() * this.getValor2();
		
		if(this.resultado == resposta) {
			resposta_correta = true;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Incorreta!");
		}
		
		System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());	
		return resposta_correta;
	}
}
