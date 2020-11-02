package devtec.co.mz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
@Table(name="Venda")
public class Venda extends AbstractEntity<Long>{
	
	@Column(name="nome_cliente")
	private String nomeCliente;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
