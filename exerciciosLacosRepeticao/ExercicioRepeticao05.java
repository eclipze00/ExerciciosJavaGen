package br.com.generation.Exercicios.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao05 {
	
	public static void main(String[] args) {
		/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)
		*/
		
		Scanner leia = new Scanner (System.in);
		
        int numero, soma = 0;
        
        System.out.print("Digite o primeiro numero a ser somado: ");
        numero = leia.nextInt();
        soma = soma + numero;

        do {
        	System.out.print("Digite o pr�ximo numero a ser somado: ");
            
            numero = leia.nextInt();
            
            soma = soma + numero;
            }
        
        while (numero != 0);
        
        System.out.print("A soma dos numeros inseridos �: " + soma);
        
        leia.close();
    }

}


