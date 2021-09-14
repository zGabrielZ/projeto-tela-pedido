package br.com.gabrielferreira.entidade;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private BigDecimal valor;
	private Categoria categoria;
	
	public Produto() {}
	
	public Produto(String nome, BigDecimal valor, Categoria categoria) {
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
