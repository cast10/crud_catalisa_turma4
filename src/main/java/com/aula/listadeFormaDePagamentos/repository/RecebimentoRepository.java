package com.aula.listadeFormaDePagamentos.repository;

import com.aula.listadeFormaDePagamentos.model.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
