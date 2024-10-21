package br.com.senac.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
