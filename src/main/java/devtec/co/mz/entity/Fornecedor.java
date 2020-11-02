package devtec.co.mz.entity;



import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="FORNECEDORES")
public class Fornecedor extends AbstractEntity<Long>{
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="celular")
	private BigDecimal celular;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getCelular() {
		return celular;
	}

	public void setCelular(BigDecimal celular) {
		this.celular = celular;
	}
	
	

}
