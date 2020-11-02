package devtec.co.mz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devtec.co.mz.dao.FornecedorDao;
import devtec.co.mz.entity.Fornecedor;

@Service @Transactional(readOnly = false)
public class FornecedorServiceImpl implements FornecedorService {

	@Autowired
	private FornecedorDao fornecedorDao;
	
	@Override
	public void save(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		fornecedorDao.save(fornecedor);

	}

	@Override
	public void update(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		fornecedorDao.update(fornecedor);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		fornecedorDao.delete(id);

	}

	@Override
	public Fornecedor findById(Long id) {
		// TODO Auto-generated method stub
		return fornecedorDao.findById(id);
	}

	@Override
	public List<Fornecedor> findAll() {
		// TODO Auto-generated method stub
		return fornecedorDao.findAll();
	}

}
