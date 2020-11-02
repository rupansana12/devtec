package devtec.co.mz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import devtec.co.mz.entity.Fornecedor;
import devtec.co.mz.service.FornecedorService;

@Controller
@RequestMapping("/fornecedores")
public class FornecedorController {
	
	@Autowired
	private FornecedorService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Fornecedor fornecedor) {
		
		return "/fornecedor/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("fornecedores", service.findAll());
		return "/fornecedor/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Fornecedor fornecedor, RedirectAttributes attr) {
		service.save(fornecedor);
		attr.addFlashAttribute("success", "Fornecedor inserido com sucesso");
		return "redirect:/fornecedores/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("fornecedor", service.findById(id));
		return "/fornecedor/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Fornecedor fornecedor, RedirectAttributes attr) {
		service.update(fornecedor);
		attr.addFlashAttribute("success", "Fornecedor editado com sucesso");
		return "redirect:/fornecedores/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		
		
			service.delete(id);
			model.addAttribute("success", "Departamento removido com sucesso!");

		return listar(model);
	}

}
