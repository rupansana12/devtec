package devtec.co.mz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import devtec.co.mz.entity.Venda;
import devtec.co.mz.service.VendaService;

@Component
public class StringToVendaConverter implements Converter<String, Venda>{

	@Autowired
	private VendaService vendaSer;

	
	@Override
	public Venda convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		
		Long id= Long.valueOf(text);

		return vendaSer.findById(id);
	}

}
