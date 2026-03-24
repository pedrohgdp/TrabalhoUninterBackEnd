package com.trabalho_uninter_loja.baozi.controllers;


import com.trabalho_uninter_loja.baozi.model.Pedido;
import com.trabalho_uninter_loja.baozi.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoRepository pedido_repository;

    public PedidoController(PedidoRepository repository) {
        this.pedido_repository = repository;
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return pedido_repository.save(pedido);
    }

    @GetMapping
    public List<Pedido> listar() {
        return pedido_repository.findAll();
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        return pedido_repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pedido_repository.deleteById(id);
    }
}