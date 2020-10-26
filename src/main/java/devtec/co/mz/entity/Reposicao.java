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
public class Reposicao {
	
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

}
