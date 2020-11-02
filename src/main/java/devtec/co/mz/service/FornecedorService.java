package devtec.co.mz.service;

import java.util.List;

import devtec.co.mz.entity.Fornecedor;

public interface FornecedorService {
	
	void save(Fornecedor fornecedor);
	
	void update(Fornecedor fornecedor);
	
	void delete(Long id);
	
	Fornecedor findById(Long id);
	
	List<Fornecedor> findAll();

}
