package br.com.alura.alurator.playground.modelo;

import br.com.alura.alurator.playground.anotacao.NomeTagXml;

@NomeTagXml("produto")
public class Produto extends SuperProduto {
	@NomeTagXml("nome")
	private String nome;
	@NomeTagXml("valor")
	private double valor;
	@NomeTagXml("marca")
	private String marca;
	public Produto(String nome, double valor, String marca) {
		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", marca=" + marca + "]";
	}
}