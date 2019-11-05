package br.com.prog3.trabFinal_1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.trabFinal_1.domain.Categoria;
import br.com.prog3.trabFinal_1.domain.Produto;
import br.com.prog3.trabFinal_1.repository.ProdutoRepository;
import br.com.prog3.trabFinal_1.resources.CategoriaResources;
import br.com.prog3.trabFinal_1.resources.ProdutoResources;
import br.com.prog3.trabFinal_1.resources.CategoriaResources;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaResources categoriaResource;
	public List<Categoria> findAll(){
		return (List<Categoria>) categoriaResource.findAll();
		}
		public Optional<Categoria> findById(Long id) {
		return (Optional<Categoria>) categoriaResource.findById(id);
		}
		public Categoria update(Categoria c) {
		return categoriaResource.save(c);
		}
		public void deleteById(Long id) {
			categoriaResource.deleteById(id);
		}
}
