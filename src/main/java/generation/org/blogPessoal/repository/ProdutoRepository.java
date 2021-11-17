package generation.org.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import generation.org.blogPessoal.model.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {	
	public List<Produto> findAllByCursoContainingIgnoreCase (String curso); 

}

