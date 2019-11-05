package br.com.prog3.trabFinal_1.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.trabFinal_1.domain.Categoria;
import br.com.prog3.trabFinal_1.service.CategoriaService;

@RestController
@RequestMapping("/api/v1/venda")
public class CategoriaResources {
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping
	public List<Categoria> findAll() {
		return categoriaService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Categoria> findById(@PathVariable("id") Long id) {
		return categoriaService.findById(id);
	}

	@PutMapping(value = "/{id}")
	public Categoria update(@PathVariable("id") Long id, @RequestBody Categoria categoria) {
		Optional<Categoria> optional = categoriaService.findById(id);
		if (optional.isPresent()) {
			Categoria c = optional.get();
			c.setNome(categoria.getNome());
			Categoria venda = null;
			c.setDesconto(venda.getDesconto());
			categoriaService.update(c);
			return c;
		} else {
			throw new RuntimeException("Não foi possível alterar a categoria deste produto");
		}
	}

	@DeleteMapping(path = { "/{id}" })
	public void deleteById(@PathVariable("id") Long id) {
		categoriaService.deleteById(id);
	}

	public Categoria save(Categoria c) {
		// TODO Auto-generated method stub
		return null;
	}

}