package br.com.prog3.trabFinal_1.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private Double desconto;
	@ManyToOne
	@JoinColumn(name = "id_curso", nullable = true, updatable = true)
	private Produto produto;
	public Categoria(String nome, Double desconto, Produto produto) {
		super();
		this.nome = nome;
		this.desconto = desconto;
		this.produto = produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
	
}