package br.com.prog3.trabFinal_1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.prog3.trabFinal_1.domain.Produto;
import br.com.prog3.trabFinal_1.repository.ProdutoRepository;
import br.com.prog3.trabFinal_1.resources.ProdutoResources;


@Service
public class ProdutoService {
	@Autowired
	private ProdutoResources produtoResource;
	public List<Produto> findAll(){
		return (List<Produto>) produtoResource.findAll();
		}
		public Optional<Produto> findById(Long id) {
		return produtoResource.findById(id);
		}
		public Produto update(Produto produto) {
		return produtoResource.save(produto);
		}
		public void deleteById(Long id) {
			produtoResource.deleteById(id);
		}
		public List<Produto> findByDescricao(String descricao){
			return (List<Produto>) ProdutoRepository.findByDescricao(descricao);
			}
}
