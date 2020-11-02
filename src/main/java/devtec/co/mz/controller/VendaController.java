package devtec.co.mz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import devtec.co.mz.entity.Venda;
import devtec.co.mz.service.VendaService;


@Controller
@RequestMapping("/vendas")
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Venda venda) {
		
		return "/venda/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("vendas", service.findAll());
		return "/venda/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Venda venda, RedirectAttributes attr) {
		service.save(venda);
		attr.addFlashAttribute("success", "Venda inserido com sucesso");
		return "redirect:/vendas/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("venda", service.findById(id));
		return "/venda/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Venda venda, RedirectAttributes attr) {
		service.update(venda);
		attr.addFlashAttribute("success", "Venda editado com sucesso");
		return "redirect:/vendas/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		
			service.delete(id);
			model.addAttribute("success", "Venda removido com sucesso!");	
		
			return listar(model);
	}

}
