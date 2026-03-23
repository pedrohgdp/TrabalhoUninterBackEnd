package com.trabalho_uninter_loja.baozi.repository;

import com.trabalho_uninter_loja.baozi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}