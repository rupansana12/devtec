package devtec.co.mz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import devtec.co.mz.entity.Produto;
import devtec.co.mz.service.ProdutoService;

@Component
public class StringToProdutoConverter implements Converter<String, Produto>{

	@Autowired
	private ProdutoService prodSer;

	
	@Override
	public Produto convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		
		Long id= Long.valueOf(text);

		return prodSer.findById(id);
	}

}
