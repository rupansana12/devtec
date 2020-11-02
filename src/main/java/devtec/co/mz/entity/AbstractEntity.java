package devtec.co.mz.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
	

}

