package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao06 {
	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
	*/
		
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
	    int cont = 0;
	    
	     do {
	    	
	    	System.out.print("Digite o n�mero a ser somado: ");	       
	        num = leia.nextInt();
	        
	        if(num % 3 == 0 && num != 0){               
	        soma = soma + num;
	        cont++;
	        	}       
	        }
	    
	     	while (num!= 0);
	    
	     	if (cont == 0) {
	     		System.out.println("Nenhum n�mero divisivel por 3 foi digitado: ");
	     	}
	    
	    else{
	    System.out.print("A m�dia dos numeros inseridos �: " + (soma / cont));
	    }	   
	    leia.close();
			
	}
}
