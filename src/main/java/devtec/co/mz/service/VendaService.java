package devtec.co.mz.service;

import java.util.List;

import devtec.co.mz.entity.Venda;

public interface VendaService {
	void save(Venda venda);
	
	void update(Venda venda);
	
	void delete(Long id);
	
	Venda findById(Long id);
	
	List<Venda> findAll();
}
