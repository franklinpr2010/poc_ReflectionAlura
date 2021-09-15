package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Field;

import br.com.alura.estoque.modelo.Produto;

public class TesteInstanciaAtributos {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Produto produto = new Produto("Produto 1", 20.0, "Marca 1");
		Class<? extends Produto> classe = produto.getClass();
		
		System.out.println(classe.getField("id"));
		
		for(Field atrib : classe.getDeclaredFields()) {
			atrib.setAccessible(true);
			System.out.println(atrib.getName() + ":" + atrib.get(produto));
		}
	}
}
