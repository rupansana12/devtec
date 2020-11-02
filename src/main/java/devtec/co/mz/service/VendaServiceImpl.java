package devtec.co.mz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devtec.co.mz.dao.VendaDao;
import devtec.co.mz.entity.Venda;

@Service @Transactional(readOnly = false)
public class VendaServiceImpl implements VendaService {
	
	@Autowired
	private  VendaDao vendaDao;

	@Override
	public void save(Venda venda) {
		// TODO Auto-generated method stub
		vendaDao.save(venda);

	}

	@Override
	public void update(Venda venda) {
		// TODO Auto-generated method stub
		vendaDao.update(venda);

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		vendaDao.delete(id);

	}

	@Override
	public Venda findById(Long id) {
		// TODO Auto-generated method stub
		return vendaDao.findById(id);
	}

	@Override
	public List<Venda> findAll() {
		// TODO Auto-generated method stub
		return vendaDao.findAll();
	}

}
