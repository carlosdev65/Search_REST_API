package br.com.javadev.springboot.service.impl;

import br.com.javadev.springboot.entity.Produto;
import br.com.javadev.springboot.repository.ProdutoRepository;
import br.com.javadev.springboot.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> buscaProduto(String query) {
        List<Produto> produtoList = produtoRepository.searchProdutos(query);
        return produtoList;
    }
}
