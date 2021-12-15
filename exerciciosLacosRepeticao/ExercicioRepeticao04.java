package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao04 {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		*/
		
		Scanner leia = new Scanner(System.in);
		int idade, sexo, opcoes, cont=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
		
		while(cont!=1) {
			System.out.println("Escreva sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe seu sexo: \n 1: Feminino \n 2: Masculino \n 3: Outros ");
			System.out.println("");
			sexo = leia.nextInt();
			
			System.out.println("Escolha a opção que te represente: \n 1: Calma \n 2: Nervosa \n 3: Agressiva ");
			System.out.println("");
			opcoes = leia.nextInt();
			
			if(opcoes==1) {
				cont2++;
			}
			if(sexo==1 && opcoes==2){
				cont3++;
			}
			if(sexo==2 && opcoes==3) {
				cont4++;
			}
			if(sexo==3 && opcoes==1) {
				cont5++;
			}
			if(idade>40 && opcoes==2) {
				cont6++;
			}
			if(idade<18 && opcoes==1) {
				cont7++;
			}
			cont++;
		}
		System.out.println("Numero de pessoas calmas: " + cont2 + ""
				+ "\n Número de mulheres nervosas: " + cont3
				+"\n Número de homens agressivos: " + cont4
				+"\n Número de outros calmos: " + cont5
				+"\n Número de pessoas nervosas com mais de 40 anos: " + cont6
				+"\nNúmero de pessoas calmas com menos de 18 anos: " + cont7);
		leia.close();
	}

}
