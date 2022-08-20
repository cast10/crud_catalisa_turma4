package com.aula42.listaDeProdutos.service;

import com.aula42.listaDeProdutos.model.ProdutosModel;
import com.aula42.listaDeProdutos.model.valoresProdutos.CalculoDesconto;
import com.aula42.listaDeProdutos.repository.PagamentosRepository;
import com.aula42.listaDeProdutos.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {

    @Autowired
    private RecebimentoRepository recebimentoRepository;
}

