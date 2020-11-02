package devtec.co.mz.dao;

import java.util.List;

import devtec.co.mz.entity.Produto;

public interface ProdutoDao {
	
	void save(Produto produto);
	
	void update(Produto produto);
	
	void delete(Long id);
	
	Produto findById(Long id);
	
	List<Produto> findAll();
}
