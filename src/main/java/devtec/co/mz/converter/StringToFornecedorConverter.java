package devtec.co.mz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import devtec.co.mz.entity.Fornecedor;
import devtec.co.mz.service.FornecedorService;


@Component
public class StringToFornecedorConverter  implements Converter<String, Fornecedor> {

	@Autowired
	private FornecedorService fornecedorService;

	@Override
	public Fornecedor convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		
		Long id= Long.valueOf(text);

		return fornecedorService.findById(id);
	}

}
