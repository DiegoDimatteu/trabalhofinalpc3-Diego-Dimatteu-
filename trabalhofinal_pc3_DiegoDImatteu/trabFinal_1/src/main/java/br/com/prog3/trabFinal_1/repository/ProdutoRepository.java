package br.com.prog3.trabFinal_1.repository;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.prog3.trabFinal_1.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	static List<Produto> findByDescricao(String descricao) {
		// TODO Auto-generated method stub
		return null;
	}
}
