package devtec.co.mz.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
@Table(name="Reposicao")
public class Reposicao extends AbstractEntity<Long>{
	
	@Column(name="validade")
	private Date validade;
	
	@Column(name="lot")
	private String lot;
	
	@Column(name="preco_compra")
	private Double preco_compra;
	
	@Column(name="preco_venda")
	private Double preco_venda;
	
	@Column(name="quantidade")
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name="fornecedor_id")
	private Fornecedor fornecedor;
	
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public Double getPreco_compra() {
		return preco_compra;
	}

	public void setPreco_compra(Double preco_compra) {
		this.preco_compra = preco_compra;
	}

	public Double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(Double preco_venda) {
		this.preco_venda = preco_venda;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
