package com.trabalho_uninter_loja.baozi.controllers;

import com.trabalho_uninter_loja.baozi.model.Produto;
import com.trabalho_uninter_loja.baozi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produto_repository;

    public ProdutoController(ProdutoRepository repository) {
        this.produto_repository = repository;
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return produto_repository.save(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return produto_repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id) {
        return produto_repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produto_repository.deleteById(id);
    }
}
