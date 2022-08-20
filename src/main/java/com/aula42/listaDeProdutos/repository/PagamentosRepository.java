package com.aula42.listaDeProdutos.repository;

import com.aula42.listaDeProdutos.model.PagamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PagamentosRepository extends JpaRepository<PagamentosModel, Long> {
}

