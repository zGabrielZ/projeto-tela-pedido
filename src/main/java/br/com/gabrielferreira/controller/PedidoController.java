package br.com.gabrielferreira.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.gabrielferreira.entidade.Pedido;
import br.com.gabrielferreira.entidade.Produto;
import br.com.gabrielferreira.service.ProdutoService;

@Named
@ViewScoped
public class PedidoController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Pedido pedido;
	
	private List<Produto> produtos;
	
	private List<Pedido> pedidos;
	
	@Inject
	private ProdutoService produtoService;
	
	private Produto produtoSelecionado;
	
	private Integer quantidade;
	
	@PostConstruct
	public void init() {
		pedidos = new ArrayList<Pedido>();
		produtos = produtoService.getProdutos();
	}
	
	public void addCarrinho() {
		pedido = new Pedido();
		pedido.setDataPedido(new Date());
		pedido.setProdutoSelecionado(produtoSelecionado.getNome());
		pedido.setValorPedido(getValor());
		pedido.setQuantidade(quantidade);
		pedidos.add(pedido);
		quantidade = null;
	}
	
	public BigDecimal getValor() {
		BigDecimal valor = BigDecimal.ZERO;
		valor = valor.add(produtoSelecionado.getValor());
		valor = valor.multiply(BigDecimal.valueOf(quantidade));
		return valor;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	
	

}
