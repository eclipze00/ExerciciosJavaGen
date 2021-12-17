package br.com.generation.Exercicios.exerciciosMetodos;

/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, 
 * 	 defina as instancias deste objeto e apresente as informações deste objeto no console.
 */ 

public class Patinete {
	
	String marca1;
	String peso1;
	int velo1;
	
	void acelerar(int speed) {
		velo1 = velo1 + speed;
	}
	void freiar(int reduc) {
		velo1  = velo1 - reduc;
	}

}
