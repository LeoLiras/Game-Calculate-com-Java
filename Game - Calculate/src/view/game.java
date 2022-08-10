package view;

import java.util.Scanner;
import model.Calcular;

public class game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular c1;
	
	public static void main(String[] args) {
		//inicia o jogo;
		game.jogar();
	}
	
	/**
	 * Método que inicia e controla o jogo;
	 */
	public static void jogar() {
		System.out.println("Informe a dificuldade: ");
		System.out.println("1 - Easy\n2 - Normal\n3 - Difícil\n4 - Muito Difícil");
		int dificuldade = game.teclado.nextInt();
		
		game.c1 = new Calcular(dificuldade);
		
		System.out.println("Informe o resultado da operação: ");
		
		if(c1.getOperacao() == 0) {
			System.out.println(c1.getValor1() + " + " + c1.getValor2());
			int resposta = game.teclado.nextInt();
			
			if(c1.calcularSomar(resposta)) {
				game.pontos++;
				System.out.println("Você tem " + game.pontos + " pontos\n");
			}
		}
		
		else if(c1.getOperacao() == 1) {
			System.out.println(c1.getValor1() + " - " + c1.getValor2());
			int resposta = game.teclado.nextInt();
			
			if(c1.calcularSubtracao(resposta)) {
				game.pontos++;
				System.out.println("Você tem " + game.pontos + " pontos\n");
			}
		}
		
		else if(c1.getOperacao() == 2) {
			System.out.println(c1.getValor1() + " x " + c1.getValor2());
			int resposta = game.teclado.nextInt();
			
			if(c1.calcularMultiplicacao(resposta)) {
				game.pontos++;
				System.out.println("Você tem " + game.pontos + " pontos\n");
			}
		}else {
			System.out.println("Operação não reconhecida");
		}
		
		System.out.println("Deseja continuar?");
		System.out.println("1 - Sim\n2 - Não\n");
		
		int continuar = game.teclado.nextInt();
		
		if(continuar == 1) {
			game.jogar();
		}else {
			System.out.println("Você fez um total de " + game.pontos + " pontos.");
			System.exit(0);
		}
	}

}
