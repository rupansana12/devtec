package devtec.co.mz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
@Table(name="Produto")
public class Produto extends AbstractEntity<Long>{
	
	@Column(name="descricao")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
