package devtec.co.mz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devtec.co.mz.dao.ProdutoDao;
import devtec.co.mz.entity.Produto;

@Service @Transactional(readOnly = false)
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoDao produtoDao;
	
	@Override
	public void save(Produto produto) {
		// TODO Auto-generated method stub
		produtoDao.save(produto);

	}

	@Override
	public void update(Produto produto) {
		// TODO Auto-generated method stub
		produtoDao.update(produto);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		produtoDao.delete(id);

	}

	@Override
	public Produto findById(Long id) {
		// TODO Auto-generated method stub
		return produtoDao.findById(id);
	}

	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return produtoDao.findAll();
	}

}
