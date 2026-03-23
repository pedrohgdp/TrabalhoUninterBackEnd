package com.trabalho_uninter_loja.baozi.repository;

import com.trabalho_uninter_loja.baozi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
