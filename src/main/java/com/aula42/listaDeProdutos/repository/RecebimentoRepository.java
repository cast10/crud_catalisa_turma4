package com.aula42.listaDeProdutos.repository;

import com.aula42.listaDeProdutos.model.RecebimentoModel;
import com.aula42.listaDeProdutos.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
