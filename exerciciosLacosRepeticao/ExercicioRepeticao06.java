package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao06 {
	/*Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
	*/
		
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
	    int cont = 0;
	    
	     do {
	    	
	    	System.out.print("Digite o número a ser somado: ");	       
	        num = leia.nextInt();
	        
	        if(num % 3 == 0 && num != 0){               
	        soma = soma + num;
	        cont++;
	        	}       
	        }
	    
	     	while (num!= 0);
	    
	     	if (cont == 0) {
	     		System.out.println("Nenhum número divisivel por 3 foi digitado: ");
	     	}
	    
	    else{
	    System.out.print("A média dos numeros inseridos é: " + (soma / cont));
	    }	   
	    leia.close();
			
	}
}
