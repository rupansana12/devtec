package devtec.co.mz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

//@Data e da biblioteca lombok, gera os getters e setters em tempo de execucao
@Data
@SuppressWarnings("serial")
@Entity
@Table(name="Reposicao_Has_Venda")
public class ReposicaoVenda extends AbstractEntity<Long>{
	
	@ManyToOne
	@JoinColumn(name="venda_id")
	private Venda venda;
	
	@ManyToOne
	@JoinColumn(name="reposicao_id")
	private Reposicao reposicao;
	
	@Column(name="preco")
	private Double preco;
	
	@Column(name="quantidade")
	Integer quantidade;

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Reposicao getReposicao() {
		return reposicao;
	}

	public void setReposicao(Reposicao reposicao) {
		this.reposicao = reposicao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
