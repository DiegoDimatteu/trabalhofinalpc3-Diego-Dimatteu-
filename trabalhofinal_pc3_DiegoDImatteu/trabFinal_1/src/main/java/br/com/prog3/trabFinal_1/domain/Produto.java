package br.com.prog3.trabFinal_1.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String descricao;
		private String nome;
		private String imagem;
		private String garantia;
		private String fabricante;
		private Double precoCompra;
		private Double precoVenda;
		private Double desconto;
		public Produto(String descricao, String nome, String imagem, String garantia, String fabricante,
				Double precoCompra, Double precoVenda, Double desconto) {
			super();
			this.descricao = descricao;
			this.nome = nome;
			this.imagem = imagem;
			this.garantia = garantia;
			this.fabricante = fabricante;
			this.precoCompra = precoCompra;
			this.precoVenda = precoVenda;
			this.desconto = desconto;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getImagem() {
			return imagem;
		}
		public void setImagem(String imagem) {
			this.imagem = imagem;
		}
		public String getGarantia() {
			return garantia;
		}
		public void setGarantia(String garantia) {
			this.garantia = garantia;
		}
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public Double getPrecoCompra() {
			return precoCompra;
		}
		public void setPrecoCompra(Double precoCompra) {
			this.precoCompra = precoCompra;
		}
		public Double getPrecoVenda() {
			return precoVenda;
		}
		public void setPrecoVenda(Double precoVenda) {
			this.precoVenda = precoVenda;
		}
		public Double getDesconto() {
			return desconto;
		}
		public void setDesconto(Double desconto) {
			this.desconto = desconto;
		}
		
}
