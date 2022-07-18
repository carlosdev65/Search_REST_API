package br.com.javadev.springboot.controller;

import br.com.javadev.springboot.entity.Produto;
import br.com.javadev.springboot.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @GetMapping("/busca")
    public ResponseEntity<List<Produto>> buscaProduto(String query){
        return ResponseEntity.ok(produtoService.buscaProduto(query));
    }
}
