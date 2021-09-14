package br.com.gabrielferreira.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.gabrielferreira.entidade.Categoria;
import br.com.gabrielferreira.entidade.Produto;

public class ProdutoService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<Produto> getProdutos(){
		List<Produto> produtos = new ArrayList<Produto>();
		Categoria frutas = new Categoria("Frutas");
		Categoria jogos = new Categoria("Jogos");
		Categoria roupas = new Categoria("Roupas");
		
		produtos.add(new Produto("Banana",BigDecimal.valueOf(5.00),frutas));
		produtos.add(new Produto("Maça",BigDecimal.valueOf(4.50),frutas));
		produtos.add(new Produto("Laranja",BigDecimal.valueOf(6.90),frutas));
		
		produtos.add(new Produto("Fifa 21",BigDecimal.valueOf(300),jogos));
		produtos.add(new Produto("PES 21",BigDecimal.valueOf(280),jogos));
		
		produtos.add(new Produto("Camiseta",BigDecimal.valueOf(80.90),roupas));
		produtos.add(new Produto("Calça Jeans",BigDecimal.valueOf(100),roupas));
		
		return produtos;
		
	}

}
