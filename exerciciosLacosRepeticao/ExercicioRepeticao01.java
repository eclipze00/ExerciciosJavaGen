package br.com.generation.exerciciosLacosRepeticao;

public class ExercicioRepeticao01 {

	public static void main(String[] args) throws InterruptedException {
		//1 - Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		for (int i=1000; i < 2000; i++){
		    if (i%11==5) {
		        System.out.println(i);
		    }
		}
	}
					
}


