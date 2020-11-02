package devtec.co.mz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import devtec.co.mz.entity.Produto;
import devtec.co.mz.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Produto produto) {
		
		return "/produto/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("produtos", service.findAll());
		return "/produto/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Produto produto, RedirectAttributes attr) {
		service.save(produto);
		attr.addFlashAttribute("success", "Produto inserido com sucesso");
		return "redirect:/produtos/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("produto", service.findById(id));
		return "/produto/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Produto produto, RedirectAttributes attr) {
		service.update(produto);
		attr.addFlashAttribute("success", "Produto editado com sucesso");
		return "redirect:/produtos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		
	
			service.delete(id);
			model.addAttribute("success", "Produto removido com sucesso!");
		
		
		return listar(model);
	}

}
