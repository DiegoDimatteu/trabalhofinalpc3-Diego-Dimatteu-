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

import br.com.prog3.trabFinal_1.domain.Produto;
import br.com.prog3.trabFinal_1.service.ProdutoService;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoResources {
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> findAll() {
		return produtoService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Produto> findById(@PathVariable("id") Long id) {
		return produtoService.findById(id);
	}

	@PutMapping(value="/{id}")
	public Produto update (@PathVariable("id") Long id, @RequestBody Produto produto) {
	Optional<Produto> optional = produtoService.findById(id);
	if(optional.isPresent()) {
	Produto p = optional.get();
	p.setDescricao(produto.getDescricao());
	p.setImagem(produto.getImagem());
	p.setNome(produto.getNome());
	p.setGarantia(produto.getGarantia());
	p.setFabricante(produto.getFabricante());
	p.setPrecoCompra(produto.getPrecoCompra());
	p.setPrecoVenda(produto.getPrecoVenda());
	p.setDesconto(produto.getDesconto());
	produtoService.update(p);
	return p;
	}
	else {
	throw new RuntimeException("Não foi possível alterar registro");
	}
	}

	@DeleteMapping(path = { "/{id}" })
	public void deleteById(@PathVariable("id") Long id) {
		produtoService.deleteById(id);
	}

	public Produto save(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

}
