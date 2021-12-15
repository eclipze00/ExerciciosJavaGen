package br.com.generation.exerciciosJava;

		/*Exercicio 2
		 *Autor: Guilherme Barbosa Rodrigues
		 *Data: 29/11/2021
		 */
	
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

import java.util.Scanner;



public class Exercicio2 {
	
	public static void main(String[] args) {
		
		   Scanner leia = new Scanner(System.in);
			int ano, mes, dia, dias;

			System.out.print("Digite os dias: ");
			dias = leia.nextInt();

			
			
			ano = dias / 365;
			mes = dias / 30;		
			
			
			System.out.print("Idade total em dias = " + dias + "\n");
			System.out.print("Idade total em meses = " + mes + "\n");
			System.out.print("Idade total em anos = " + ano + "\n");
			
		    }

		}

