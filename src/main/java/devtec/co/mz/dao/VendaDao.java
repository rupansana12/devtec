package devtec.co.mz.dao;

import java.util.List;

import devtec.co.mz.entity.Venda;

public interface VendaDao {
	
	void save(Venda venda);
	
	void update(Venda venda);
	
	void delete(Long id);
	
	Venda findById(Long id);
	
	List<Venda> findAll();
}
