package com.trabalho_uninter_loja.baozi.controllers;

import com.trabalho_uninter_loja.baozi.model.Cliente;
import com.trabalho_uninter_loja.baozi.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository cliente_repository;

    public ClienteController(ClienteRepository repository) {
        this.cliente_repository = repository;
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return cliente_repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return cliente_repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return cliente_repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        cliente_repository.deleteById(id);
    }
}
