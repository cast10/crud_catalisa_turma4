package com.aula.listadeFormaDePagamentos.repository;

import com.aula.listadeFormaDePagamentos.model.PagamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PagamentosRepository extends JpaRepository<PagamentosModel, Long> {
}

