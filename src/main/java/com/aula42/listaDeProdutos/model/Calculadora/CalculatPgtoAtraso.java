package com.aula42.listaDeProdutos.model.Calculadora;

import com.aula42.listaDeProdutos.model.PagamentosModel;
import com.aula42.listaDeProdutos.model.ProdutosModel;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;

import java.lang.management.BufferPoolMXBean;
import java.math.BigDecimal;

public class CalculatPgtoAtraso implements  CalcularValorPago{

@Override
    public BigDecimal calcular (PagamentosModel pagamentosModel){

    return pagamentosModel.getValorAPagar().add(pagamentosModel.getDiferencaValor());
}
}
