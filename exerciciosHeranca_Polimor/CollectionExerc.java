package br.com.generation.Exercicios.exerciciosHeranca_Polimor;

import java.util.ArrayList;
import java.util.Collections;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection 
 * do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
*/

public class CollectionExerc {
	
	public static void main(String[] args) {
		
		String e1 = "Estoque de comidas";
		String e2 = "Estoque de bebidas";
		
		ArrayList<String>estoques = new ArrayList<>();
		estoques.add(e1);//Armazenar
		estoques.add(e2);//Armazenar
		
		System.out.println(estoques);
		
		estoques.remove(0);//Removendo
		System.out.println(estoques);
		
		for(String i: estoques) {
			System.out.println("Estoque: " + i);//Atualizando
			
			System.out.println("Dados restantes: " + estoques.size());//Apresentar dados restantes
			
			
		}
			
	}

}
