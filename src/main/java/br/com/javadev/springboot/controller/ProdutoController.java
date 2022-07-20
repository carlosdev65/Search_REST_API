package br.com.javadev.springboot.controller;

import br.com.javadev.springboot.entity.Produto;
import br.com.javadev.springboot.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @GetMapping("/busca")
    public ResponseEntity<List<Produto>> buscaProduto(@RequestParam("query") String query){
        return ResponseEntity.ok(produtoService.buscaProduto(query));
    }
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return produtoService.criarProduto(produto);
    }
}
