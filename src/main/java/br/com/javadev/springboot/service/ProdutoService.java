package br.com.javadev.springboot.service;

import br.com.javadev.springboot.entity.Produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> buscaProduto(String query);

    Produto criarProduto(Produto produto);
}
