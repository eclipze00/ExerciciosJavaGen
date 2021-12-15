package br.com.generation.exerciciosMetodos;

import java.util.Scanner;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
 *   em seguida crie um objeto avi�o, defina as instancias deste objeto 
 *   e apresente as informa��es deste objeto no console.
 */

public class TestaAviao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Velocidade do Avi�o: ");
		int fly = sc.nextInt();

		Aviao a1 = new Aviao();
		
		a1.companhia = "Gol Linhas A�reas";
		a1.marca = "Boeing 777";
		a1.voar = 0;
		
		System.out.println("Voc� est� viajando pela Companhia: " + a1.companhia);
		System.out.println("O modelo do avi�o �: " + a1.marca);
		
		System.out.println("O avi�o ira decolar!");
		
		a1.decolar(fly);
		
		System.out.println("O avi�o ira decolar ap�s atingir " + a1.voar + " n�s");
		
		a1.pousar(12);
		System.out.println("O avi�o ira pousar ap�s atingir " + a1.voar + " n�s");
		
		sc.close();
	}

}
