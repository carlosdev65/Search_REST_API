package br.com.javadev.springboot.repository;

import br.com.javadev.springboot.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("SELECT p FROM Produto p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%') " +
            "Or p.descricao LIKE CONCAT('%', :query, '%')"
    )
    List<Produto> searchProdutos(String query);

    @Query(value = "SELECT * FROM Produto p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%') " +
            "Or p.descricao LIKE CONCAT('%', :query, '%')", nativeQuery = true
    )
    List<Produto> searchProdutosSQL(String query);
}
