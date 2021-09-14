package br.com.gabrielferreira.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date dataPedido;
	private Integer quantidade;
	private List<Produto> produtos = new ArrayList<Produto>();
	private String produtoSelecionado;
	private BigDecimal valorPedido;
	
	public Pedido() {}

	public Pedido(Date dataPedido, Integer quantidade) {
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(String produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public BigDecimal getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(BigDecimal valorPedido) {
		this.valorPedido = valorPedido;
	}
	

}
