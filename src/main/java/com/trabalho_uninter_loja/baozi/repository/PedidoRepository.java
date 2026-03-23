package com.trabalho_uninter_loja.baozi.repository;

import com.trabalho_uninter_loja.baozi.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}