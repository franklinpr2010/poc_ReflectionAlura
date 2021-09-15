package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.anotacao.NomeTagXml;
import br.com.alura.alurator.playground.modelo.Produto;

public class TesteManipulaAnnotation {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Object produto = new Produto("Produto 1", 20.0, "Marca 1");
		Class<?> classe = produto.getClass();
		//Verificar se t� usando essa anota��o na classe
        System.out.println(classe.getDeclaredAnnotation(NomeTagXml.class).value());
	}

}
