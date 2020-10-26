package devtec.co.mz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Entity
@Table(name="Produto")
public class Produto {
	
	private String descricao;

}
