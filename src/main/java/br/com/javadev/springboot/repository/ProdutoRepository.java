package br.com.javadev.springboot.repository;

import br.com.javadev.springboot.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
